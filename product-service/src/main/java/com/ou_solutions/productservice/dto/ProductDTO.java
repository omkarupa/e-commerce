package com.ou_solutions.productservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
	
	
	String productId;
	String name ;
	String description; 
	BigDecimal price ;
	String category ;
	String brand ;
	String imageUrl;
	int stockQuantity;
	
	

}
