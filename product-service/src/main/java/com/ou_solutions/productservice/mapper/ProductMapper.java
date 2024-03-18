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
	
	public Product mapProduct(ProductDTO productDTO) throws Exception
	{
		
		
		return  Product.builder()
				.productId(productDTO.getProductId())
				.name(productDTO.getName())
				.description(productDTO.getDescription())
				.price(productDTO.getPrice())
				.brand(productDTO.getBrand())
				.category(productDTO.getCategory())
				.imageUrl(productDTO.getImageUrl())
				.price(productDTO.getPrice())
				.build();
	}
	
	public ProductDTO mapProductDTO(Product product)
	{
		return  ProductDTO.builder()
				.productId(product.getProductId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.brand(product.getBrand())
				.category(product.getCategory())
				.imageUrl(product.getImageUrl())
				.price(product.getPrice())
				.build();
	}
	

}
