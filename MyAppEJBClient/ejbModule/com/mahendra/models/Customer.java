package com.mahendra.models;

public class Customer {

	private String custName;
	private String address;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String custName, String address) {
		super();
		this.custName = custName;
		this.address = address;
	}
	
	
}
