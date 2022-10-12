package com.product.productprize.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_type")
	private String productType;
	@Column(name = "productCategory")
	private String productCategory;
	@Column(name = "base_price")
	private double basePrice;

	public int getProductId() {
		return productId;
	}

	public Product(int productId, String productName, String productType, String productCategory, double basePrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.basePrice = basePrice;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public Product() {

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCategory=" + productCategory + ", basePrice=" + basePrice +  "]";
	}

}
