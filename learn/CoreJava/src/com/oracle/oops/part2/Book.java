package com.oracle.oops.part2;

public class Book extends Product {
	private String author;
	private String genre;
	public Book(int productCode, String productName, float price, float ratings, String author, String genre) {
		super(productCode, productName, price, ratings);
		this.author = author;
		this.genre = genre;
	}
	
	void print() {
		super.print();
		System.out.println("Author:\t"+this.author);
		System.out.println("genre:\t"+this.genre);
	}
}
