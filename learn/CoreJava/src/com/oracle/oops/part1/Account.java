package com.oracle.oops.part1;

public class Account {
	private int accoutNumber;
	private String accountHolderName;
	private float bankBalance;
	
	void transferFunds(Account beneficiaryAccount, float amtToTransfer) {
		if(amtToTransfer <= 0) {
			System.out.println("transfer amount must be greater than 0");
		}
		else if(amtToTransfer < bankBalance) {
			this.bankBalance = this.bankBalance - amtToTransfer;
			amtToTransfer += beneficiaryAccount.getBankBalance();
			beneficiaryAccount.setBankBalance(amtToTransfer);	
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}

	public int getAccoutNumber() {
		return accoutNumber;
	}

	public void setAccoutNumber(int accoutNumber) {
		this.accoutNumber = accoutNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public float getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(float bankBalance) {
		this.bankBalance = bankBalance;
	}
	
}
