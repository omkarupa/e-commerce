package com.ou_solutions.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ou_solutions.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
