package com.fred.ecommerce.product_service.service.impl;

import com.fred.ecommerce.product_service.dto.ProductDTO;
import com.fred.ecommerce.product_service.repository.ProductRepository;
import com.fred.ecommerce.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDTO create(ProductDTO dto) {
        return null;
    }

    @Override
    public List<ProductDTO> findAll() {
        return List.of();
    }

    @Override
    public ProductDTO findById(Long id) {
        return null;
    }

    @Override
    public ProductDTO update(Long id, ProductDTO dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
