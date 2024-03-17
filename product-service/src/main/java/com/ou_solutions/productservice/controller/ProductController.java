package com.ou_solutions.productservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ou_solutions.productservice.dto.ProductDTO;
import com.ou_solutions.productservice.entity.Product;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	/*2. **Product Service**:
		- Get product by ID: `GET /products/{productId}`
		- Create product: `POST /products`
		- Update product: `PUT /products/{productId}`
		- Delete product: `DELETE /products/{productId}`
		- Search products: `GET /products/search`
	*/
	
	
	@GetMapping("/search")
	public List<Product> fetchAllProducts()
	{
		return null;
	}

	@GetMapping("/{productId}")
	public Product fetchProductById(@PathVariable String productId)
	{
		return null;
	}

	@PostMapping("")
	public Product createProduct(@RequestBody ProductDTO productDTO)
	{
		return null;
	}
	
	@PutMapping("/{productId}")
	public Product updateProduct(String productId)
	{
		return null;
	}

	@DeleteMapping("/{productId}")
	public Product deleteProduct(String productId)
	{
		return null;
	}

	
	


}
