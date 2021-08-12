package com.oracle.oops.part1;

public class StaticEx2 {
	int x = 10;// Instance variable...
	static int y=50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub...
		StaticEx2 s = new StaticEx2();
		System.out.println(s.x);
		System.out.println(y);
		s.f();

	}
	void f() { // Instance Method...
		System.out.println("f() method invoked...");
		System.out.println(x);
		System.out.println(y);
	}
	static void f2() {
//		System.out.println(this.x);// cannot access this / super keyword from static content
		System.out.println(y);
	}
}
