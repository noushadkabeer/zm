package com.mintapple.Entity;

import javax.persistence.Id;

public class Customer {
	@Id
	private String customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerStreet;
	private String customerPincode;
	private String customerState;
	private String customerCountry;
	
	
	
	public Customer(String customerId, String customerFirstName, String customerLastName, String customerAddress,
			String customerStreet, String customerPincode, String customerState, String customerCountry) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
		this.customerStreet = customerStreet;
		this.customerPincode = customerPincode;
		this.customerState = customerState;
		this.customerCountry = customerCountry;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerStreet() {
		return customerStreet;
	}
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}
	public String getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	public String getCustomerCountry() {
		return customerCountry;
	}
	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerAddress=" + customerAddress + ", customerStreet=" + customerStreet
				+ ", customerPincode=" + customerPincode + ", customerState=" + customerState + ", customerCountry="
				+ customerCountry + "]";
	}

	
}
