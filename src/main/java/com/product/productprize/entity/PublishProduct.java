package com.product.productprize.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PublishProduct {

	@Id
	private int productId;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	private double discount;
	private double finalPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public PublishProduct() {

	}

	public PublishProduct(int productId, String name, String productType, String category, double basePrice,
			double discount, Charges charges, double finalPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.discount = discount;
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "PublishProduct [productId=" + productId + ", name=" + name + ", productType=" + productType
				+ ", category=" + category + ", basePrice=" + basePrice + ", discount=" + discount + ", finalPrice=" + finalPrice + "]";
	}

}
