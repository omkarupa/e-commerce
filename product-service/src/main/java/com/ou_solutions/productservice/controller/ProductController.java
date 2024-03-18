package com.ou_solutions.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.ou_solutions.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	
	/*2. **Product Service**:
		- Get product by ID: `GET /products/{productId}`
		- Create product: `POST /products`
		- Update product: `PUT /products/{productId}`
		- Delete product: `DELETE /products/{productId}`
		- Search products: `GET /products/search`
	*/
	
	private final ProductService productService;
	
	
	@GetMapping("/search")
	public List<Product> fetchAllProducts()
	{
		return null;
	}

	@GetMapping("/{productId}")
	public ResponseEntity<ProductDTO> fetchProductById(@PathVariable String productId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.fetchProductById(productId));
	}

	@PostMapping("")
	public ResponseEntity createProduct(@RequestBody ProductDTO productDTO) throws Exception
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.createProduct(productDTO));
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity updateProduct(String productId)
	{
		ProductDTO product =  productService.fetchProductById(productId);
		
		if(product != null)
		{
			return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(productId));
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ProductId");
		}
		
	}

	@DeleteMapping("/{productId}")
	public Product deleteProduct(String productId)
	{
		return null;
	}

	
	


}
