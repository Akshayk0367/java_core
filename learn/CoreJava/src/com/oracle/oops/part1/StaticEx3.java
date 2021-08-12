package com.oracle.oops.part1;

public class StaticEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t = null; // now Test object is eligible for gc..garbage collection
		System.out.println(t.x);
	}

}

class Test{
	static int x = 10;
}
