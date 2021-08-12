package com.oracle.oops.part2;

public class InstanceBlock {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("Count: "+e.counter);
		System.out.println("-----------------------");
		Employee e1 = new Employee("a","b");
		System.out.println("Count: "+e.counter);
	}

}

class Employee{
	static int counter;
	//This is an instance block, this will be invoked in every constructor call.
	{
		counter++;
		System.out.println("I m instance block");
	}	
	static {
		System.out.println("this is a static block");
	}
	public Employee() {
		System.out.println("default constructor...");
	}
	public Employee(String fname, String lname) {
		System.out.println("constructor 2...");
	}
	
}
