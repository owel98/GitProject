package com.sopra.git;

public class Bank {
	private int bankId;
	private String bankName;
	private String accNumber;
	
	public Bank(int bankId, String bankName, String accNumber) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accNumber = accNumber;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accNumber=" + accNumber + "]";
	}
	

}
