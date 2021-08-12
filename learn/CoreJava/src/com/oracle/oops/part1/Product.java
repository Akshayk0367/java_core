package com.oracle.oops.part1;

public class Product {
	//state / properties/ instance variable
	private int productCode; // variable name must be in camelCase
	private String productName;
	private float price;
	private float ratings;
	
	//Behaviour  /instance method
	void applyOfferCode(int offerCode) {
		
	}
	
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	//this method will automatically get called just before object
	// is removed
	public void finalize() {
		System.out.println("freeing up" + productName);
	}
}
