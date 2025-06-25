package com.fred.ecommerce.product_service.mapper;

import com.fred.ecommerce.product_service.dto.ProductDTO;
import com.fred.ecommerce.product_service.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .imageURL(product.getImageURL())
                .build();
    }

    public Product toEntity(ProductDTO dto) {
        return Product.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .imageURL(dto.getImageURL())
                .build();
    }
}
