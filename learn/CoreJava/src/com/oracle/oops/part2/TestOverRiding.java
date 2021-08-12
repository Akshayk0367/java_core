package com.oracle.oops.part2;

public class TestOverRiding {
	public static void main(String[] args) {
		Product p1 = new Laptop(101,"Dell",75000,4.6f,"16 GB RAM","Intel i7","Windows 10 pro");
		Product p2 = new Apparal(102,"T Shirt",1599,4.2f,"Cotton","Pink");
		Product p3 = new Book(103,"Physics HC Verma",1399,3.9f,"HCV","Science");
		
		Product myProduct[] = {p1,p2,p3};
		
		for(Product p:myProduct) {
			
			p.print();
			System.out.println("---------------");
		}
	}
}
