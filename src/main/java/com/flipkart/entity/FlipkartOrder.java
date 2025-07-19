package com.flipkart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flipkart_order")
public class FlipkartOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDERID")
	private long orderId;
	@Column(name = "PRODUCTNAME")
	private String productName;
	@Column(name = "TOTALAMOUNT")
	private double totalAmount;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public FlipkartOrder(long orderId, String productName, double totalAmount) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.totalAmount = totalAmount;
	}
	public FlipkartOrder(String productName, double totalAmount) {
		super();
		this.productName = productName;
		this.totalAmount = totalAmount;
	}
	public FlipkartOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlipkartOrder [orderId=");
		builder.append(orderId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", totalAmount=");
		builder.append(totalAmount);
		builder.append("]");
		return builder.toString();
	}

}
