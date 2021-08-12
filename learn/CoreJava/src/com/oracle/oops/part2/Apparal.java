package com.oracle.oops.part2;

public class Apparal extends Product{
	private String fabric;
	private String color;
	public Apparal(int productCode, String productName, float price, float ratings, String fabric, String color) {
		super(productCode, productName, price, ratings);
		this.fabric = fabric;
		this.color = color;
	}
	void print() {
		super.print();
		System.out.println("fabric:\t"+this.fabric);
		System.out.println("color:\t"+this.color);
	}
	
	
	
}
