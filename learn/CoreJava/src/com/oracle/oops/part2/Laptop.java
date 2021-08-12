package com.oracle.oops.part2;

public class Laptop extends Product {
	private String memory;
	private String processor;
	private String os;
	public Laptop(int productCode, String productName, float price, 
			float ratings, String memory, String processor,String os) {
		super(productCode, productName, price, ratings);
		this.memory = memory;
		this.processor = processor;
		this.os = os;
	}
	void print() {
		super.print();
		System.out.println("memory:\t "+this.memory);
		System.out.println("Processor:  "+this.processor);
		System.out.println("OS \t: "+this.os);
	}
	
}
