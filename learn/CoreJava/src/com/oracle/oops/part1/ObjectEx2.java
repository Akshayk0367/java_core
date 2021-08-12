package com.oracle.oops.part1;

public class ObjectEx2 {

	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setAccoutNumber(1001);
		ac1.setAccountHolderName("Akshay");
		ac1.setBankBalance(5000f);
		print(ac1);
		
		Account ac2 = new Account();
		ac2.setAccoutNumber(1002);
		ac2.setAccountHolderName("John");
		ac2.setBankBalance(3000f);
		
		print(ac2);
		ac1.transferFunds(ac2, 2500);
//		ac1.transferFunds(ac1, 3000);
		print(ac1);
		print(ac2);

	}

	static void print(Account ac) {
		// TODO Auto-generated method stub
		System.out.println("Acc. holder: " + ac.getAccountHolderName());
		System.out.println("Acc. Number: " + ac.getAccoutNumber());
		System.out.println("Acc. Balance: " + ac.getBankBalance());
		System.out.println("----------------------------");
	}
	
}
