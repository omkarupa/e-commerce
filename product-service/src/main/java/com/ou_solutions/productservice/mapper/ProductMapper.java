package com.ou_solutions.productservice.mapper;

import com.ou_solutions.productservice.dto.ProductDTO;
import com.ou_solutions.productservice.entity.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductMapper {
	
	private static ProductMapper util;
	
	private ProductMapper()
	{
		log.info("Implemented Singleton class for Product Mapper");
	}
	
	
	
	public static ProductMapper getInstance()
	{
		
		if(util != null)
		{
			return util;
		}
		else {
			util = new ProductMapper();
			return util;
		}
		
	}
	
	public Product mapProduct(ProductDTO productDTO)
	{
		return  Product.builder()
				.productId(null)
				.name(null)
				.description(null)
				.price(null)
				.brand(null)
				.category(null)
				.imageUrl(null)
				.price(null)
				.build();
	}
	
	public ProductDTO mapProductDTO(Product product)
	{
		return  ProductDTO.builder()
				.productId(null)
				.name(null)
				.description(null)
				.price(null)
				.brand(null)
				.category(null)
				.imageUrl(null)
				.price(null)
				.build();
	}
	

}
