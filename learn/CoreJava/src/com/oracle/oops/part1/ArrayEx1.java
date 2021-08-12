package com.oracle.oops.part1;

public class ArrayEx1 {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println(num[0]);//10
		System.out.println(num[3]);//0
//		System.out.println(num[5]);//ArrayIndexOutOfBoundException & program stops here..
		System.out.println("Array size is: "+num.length);
		
		System.out.println("iterating by traditional loop----");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\niterating by for each loop----");
		for(int eachElement : num) {
			System.out.print(eachElement+" ");
		}
		int[] studRolls = {101,102,103,104,104};
		System.out.println("\nlist of students roll no. ----");
		for(int i=0; i<studRolls.length; i++) {
			System.out.print(studRolls[i]+" ");
		}
		
		//Create an array with a type of string and store names and iterate it;
		String[] names = {"Aa","Bb","Cc","Dd","Ee"};
		System.out.println("\nnames......String array");
		for(String name : names) {
			System.out.print(name + " ");
		}
		
	 }

}
