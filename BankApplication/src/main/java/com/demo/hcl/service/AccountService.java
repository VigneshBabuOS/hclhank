package com.demo.hcl.service;

import java.util.List;

import com.demo.domain.BankDetails;


public interface AccountService {
	
	public List<BankDetails> getAccDetails();
	
	public String addFavAccount(BankDetails bankDetails);

}
