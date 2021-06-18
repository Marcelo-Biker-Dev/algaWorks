package com.chambertran.chamberfood.models;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal totalPrice;
	
	public Product(String name, BigDecimal totalPrice) {
		this.name = name;
		this.totalPrice = totalPrice;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
}
