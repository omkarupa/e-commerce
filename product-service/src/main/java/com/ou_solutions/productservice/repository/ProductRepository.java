package com.ou_solutions.productservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ou_solutions.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product>  findByProductId(String productId);

}
