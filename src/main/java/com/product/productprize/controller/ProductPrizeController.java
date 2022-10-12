package com.product.productprize.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.productprize.entity.Product;
import com.product.productprize.service.ProductService;

@RestController
public class ProductPrizeController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProductDetails")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();	
	}
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);	
	}
	
	@GetMapping("/getProductDetails/{productId}")
	public Product getProductDetails(@PathVariable int productId) {
		return productService.getByProductId(productId);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
		return ("Deleted Product with ID:- " + productId); //returning id just to show on postman output - earlier return type was null
	}
	
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
}
