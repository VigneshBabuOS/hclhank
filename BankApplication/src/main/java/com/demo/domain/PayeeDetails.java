package com.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PayeeDetails {
	
	@Id
	private String customerId;
	private String customerName;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
