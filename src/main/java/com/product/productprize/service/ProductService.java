package com.product.productprize.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.productprize.entity.Charges;
import com.product.productprize.entity.Product;
import com.product.productprize.entity.PublishProduct;
import com.product.productprize.repository.ProductRepository;

@Service
public class ProductService {
	
	Charges charges=new Charges();
	PublishProduct publishProduct=new PublishProduct();
	@Autowired
	private ProductRepository productRepo;

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		return (List<Product>) productRepo.findAll();
	}

	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	public Product getByProductId(int productId) {
		Product product = productRepo.findByProductId(productId);
		if(product.getProductCategory()=="Electronics") {
			charges.setGst(18.0);
			publishProduct.setDiscount(15.0);
			charges.setDelivery(350.0);
		}
		if(product.getProductCategory()=="Home Appliances"){
			charges.setGst(24.0);
			publishProduct.setDiscount(15.0);
			charges.setDelivery(800.0);
		}
		if(product.getProductCategory()=="Clothing"){
			charges.setGst(12.0);
			publishProduct.setDiscount(15.0);
			charges.setDelivery(0.0);
		}
		if(product.getProductCategory()=="Furniture"){
			charges.setGst(18.0);
			publishProduct.setDiscount(15.0);
			charges.setDelivery(300.0);
		}
		return product;	
		
	}

	public void deleteProduct(int productId) {
		productRepo.deleteByProductId(productId);		
	}

	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

}
