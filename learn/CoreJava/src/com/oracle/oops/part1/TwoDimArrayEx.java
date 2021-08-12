package com.oracle.oops.part1;


public class TwoDimArrayEx {
public static void main(String[] args) {
	int arr[][]=new int[2][3];
	 //or
	int nums[][]= { {1,2,3}, {4,5,6} };
	
	System.out.println("----iterating by traditional loop----");
	for(int i=0;i<nums.length;i++ ) {
		
		for(int j=0;j<nums[i].length;j++ ) {
			System.out.print(nums[i][j]+"  ");
		}
		System.out.println();
	}
	//iterate by for each loop .....
	System.out.println("\n---- iterating by for each loop ----");
	for(int [] arr1:nums) {
		for(int element:arr1) {
			System.out.print(element +" ");
		}
		System.out.println();
	}
}
}

