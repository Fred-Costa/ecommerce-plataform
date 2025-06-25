package com.fred.ecommerce.product_service.repository;

import com.fred.ecommerce.product_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String productName);
    boolean existsByName(String productName);

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
    List<Product> searchByName(@Param("name") String name);
}
