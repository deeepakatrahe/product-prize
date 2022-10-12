package com.product.productprize.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Charges {
	
	@Id
	@GeneratedValue
	private int id;
	private double gst;
	private double delivery;
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDelivery() {
		return delivery;
	}
	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	
	public Charges() {
		
	}
	public Charges(double gst, double delivery) {
		super();
		this.gst = gst;
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "Charges [gst=" + gst + ", delivery=" + delivery + "]";
	}
	
	

}
