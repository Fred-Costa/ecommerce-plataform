package com.fred.ecommerce.product_service.service;

import com.fred.ecommerce.product_service.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    // Simple CRUD
    ProductDTO create(ProductDTO dto);
    List<ProductDTO> findAll();
    ProductDTO findById(Long id);
    ProductDTO update(Long id, ProductDTO dto);
    void delete (Long id);

}
