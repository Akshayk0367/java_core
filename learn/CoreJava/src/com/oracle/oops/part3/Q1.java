package com.oracle.oops.part3;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p =new Child();
		p.f1();
		p.f2();
		Child.f2();
	}

}

class Parent{
	void f1() { // method overriding 
		System.out.println("I m  f1 .....from Parent");
	}
	static void f2() {// method hiding
		System.out.println("I m f2.....from Parent");
	}
}

class Child extends Parent{
	void f1() {
		System.out.println(" I m f1 .... frm child");
	}
	static void f2() {
		System.out.println("i m f2....from child");
	}
}
