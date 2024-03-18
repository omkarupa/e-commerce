package com.ou_solutions.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ou_solutions.productservice.dto.ProductDTO;
import com.ou_solutions.productservice.entity.Product;
import com.ou_solutions.productservice.mapper.ProductMapper;
import com.ou_solutions.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepo;
	

	public List<Product> fetchAllProducts()
	{
		return productRepo.findAll();
	}

	public ProductDTO fetchProductById(String productId)
	{
		if(productRepo.findByProductId(productId).isPresent())
		{
			return ProductMapper.getInstance().mapProductDTO(productRepo.findByProductId(productId).get());
		}
		return null;
	}

	public Product createProduct(ProductDTO productDTO) throws Exception
	{
		return  productRepo.save(ProductMapper.getInstance().mapProduct(productDTO));
	}

	public ProductDTO updateProduct(String productId)
	{
		
		if(productRepo.findByProductId(productId).isPresent())
		{
			return ProductMapper.getInstance().mapProductDTO(productRepo.findByProductId(productId).get());
		}
		return null;
		
	}

	public ProductDTO deleteProduct(String productId)
	{
		if(productRepo.findByProductId(productId).isPresent())
		{
			return ProductMapper.getInstance().mapProductDTO(productRepo.findByProductId(productId).get());
		}
		return null;
	}



}
