package com.ou_solutions.productservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	private String productId;
	private String name;
	private String description;
	private BigDecimal price;
	private String category ;
	private String brand ;
	private String imageUrl;
	private int stockQuantity;

}
