package com.fred.ecommerce.product_service.service.impl;

import com.fred.ecommerce.product_service.dto.ProductDTO;
import com.fred.ecommerce.product_service.entity.Product;
import com.fred.ecommerce.product_service.mapper.ProductMapper;
import com.fred.ecommerce.product_service.repository.ProductRepository;
import com.fred.ecommerce.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper mapper;

    @Override
    public ProductDTO create(ProductDTO dto) {
        Product product = mapper.toEntity(dto);
        return mapper.toDTO(productRepository.save(product));
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDTO findById(Long id) {
        if (!productRepository.existsById(id)) {
            throw new NoSuchElementException("Product with this id not founded: " + id);
        }

        Product product = productRepository.findById(id).orElseThrow();

        return mapper.toDTO(product);
    }

    @Override
    public ProductDTO update(Long id, ProductDTO dto) {

        Product existing = productRepository.findById(id).orElseThrow();

        existing.setName(dto.getName());
        existing.setPrice(dto.getPrice());
        existing.setDescription(dto.getDescription());
        existing.setImageURL(dto.getImageURL());

        return mapper.toDTO(productRepository.save(existing));

    }

    @Override
    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new NoSuchElementException("Product with this id not founded: " + id);
        }

        productRepository.deleteById(id);
    }
}
