package com.oracle.oops.part2;

public class ConstructorsEx1 {

	public static void main(String[] args) {
//		Customer2 c2 = new Customer2();
//		Customer c1 = new Customer();
//		Customer3 c3 = new Customer3(); ERROR!!
//		Customer3 c3 = new Customer3("Java");
//		Customer3 c4 = new Customer3(100,"hundred");
		
		Student s = new Student();
		Customer c = new Customer();
		Student s1 = new Student();
		
		
		
	}

}

class Person {
	static {
		System.out.println("i m static block");
	}
	{
		System.out.println("person instance block");
	}
	Person(String x){
		System.out.println("i m person, "+x);
	}
	Person(){
		
	}
}


class Customer extends Person{
	{
		System.out.println("customer instaance block...");
	}
	Customer(){
		System.out.println("customer constructor");
	}
}


class Student extends Person{
	{
		System.out.println("stud ins block...");
	}
	Student(){
		System.out.println("stud const...");
	}
}


class Customer2 extends Person{
	Customer2(){
		super("passing the argument");
		System.out.println("Customer2 instance created...");
	}
}

//
//class Customer3{
//	
//	Customer3(String name){
//		System.out.println("Customer3 instance created..."+name);
//	}
//	Customer3(int cid, String name){
//		System.out.println("Customer3 parameter constructor...");
//		System.out.println(cid+" "+name);
//	}
//}