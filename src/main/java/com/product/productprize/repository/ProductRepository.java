package com.product.productprize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.productprize.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("Select e from Product e where e.productId=:productId")
	Product findByProductId(int productId);

	@Query("Select e from Product e where e.productId=:productId")
	void deleteByProductId(int productId);
	
}
