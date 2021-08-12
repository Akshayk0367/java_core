package com.oracle.oops.part1;

public class InheritanceEx {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setProductCode(101);
		laptop.setProductName("DELL LAPTOP");
		laptop.setPrice(75000);
		laptop.setRatings(4.5f);
		laptop.setMemory("16 GB RAM");
		laptop.setProcessor("Intel i7 10th gen");
		laptop.setOs("windows");
		
		System.out.println(laptop.getProductName()+" "+laptop.getPrice());
		
		//Create obj of book
		Book book = new Book();
		book.setProductName("Java Book");
		book.setProductCode(102);
		book.setPrice(500);
		book.setAuthor("James Goslin");
		book.setGenre("Computers");
		
		System.out.println(book.getProductName()+" "+book.getPrice()+" "+book.getAuthor()+" "+book.getGenre());
		
		//Create obj for apparal also;
		Apparal apparal = new Apparal();
		apparal.setProductCode(103);
		apparal.setProductName("US Polo T-Shirt");
		apparal.setPrice(1299);
		apparal.setRatings(4.2f);
		apparal.setColor("Navy Blue");
		apparal.setFabric("cotton");
		
		System.out.println(apparal.getProductName()+", Rs. "+apparal.getPrice()+", Color: "+apparal.getColor());
		
		//create an array with type of product and add all the products
		Product[] products = new Product[3];
		products[0] = laptop;
		products[1] = book;
		products[2] = apparal;
		
		System.out.println("---------------------------------------------------------");
		for(Product p : products) {
//			System.out.println("Product Code:  "+p.getProductCode()+", Product name: "+p.getProductName()+", Price:  Rs. "+p.getPrice());
			System.out.println(p.getProductCode()+", "+p.getProductName()+", Rs. "+p.getPrice());
		}
	}

}
