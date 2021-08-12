package com.oracle.oops.part1;

public class ObjectEx1 {

	public static void main(String[] args) {
		Product p = new Product();
		p.setProductCode(101);
		p.setProductName("Apple iPhone 12");
		p.setPrice(63699);
		p.setRatings(4.6f);
		
		print(p);
		
		Product p2 = new Product();
		p2.setProductCode(102);
		p2.setProductName("T Shirt");
		p2.setPrice(799);
		p2.setRatings(4.5f);
		
		System.out.println("-----------------------------------");
		print(p2);
		
		p = p2;
		System.gc();
		System.out.println("-----------------------------------");
		print(p);
		
	}

	static void print(Product p) {
		System.out.println("p code: "+ p.getProductCode());
		System.out.println("Prod name :"+ p.getProductName());
		System.out.println("Price: "+ p.getPrice());
		System.out.println("ratings : "+ p.getRatings());
		
	}
	

}
