package com.oracle.oops.part2;

public class Product {
	private int productCode; // variable name must be in camelCase
	private String productName;
	private float price;
	private float ratings;
	public Product(int productCode, String productName, float price, float ratings) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.ratings = ratings;
	}
	void print() {
		System.out.println("p code: "+ this.productCode);
		System.out.println("Prod name :"+ this.productName);
		System.out.println("Price: "+ this.price);
		System.out.println("ratings : "+ this.ratings);
	}
}
