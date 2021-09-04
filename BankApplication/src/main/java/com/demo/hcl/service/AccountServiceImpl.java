package com.demo.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.BankDetails;
import com.demo.hcl.repo.HclRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	  @Autowired 
	  HclRepository hclRepo;
	 
	@Override
	public List<BankDetails> getAccDetails(){
		
		List<BankDetails> getAccDetails = new ArrayList<>();
		
		getAccDetails = hclRepo.getAccDetails();	
		
		return getAccDetails;
		
	}
	
	@Override
	public String addFavAccount(BankDetails bankDetails) {
		String msg ="";
		
		try {
			hclRepo.save(bankDetails);
			msg="Account Added Successfully";
		} catch (Exception e) {
			msg="Adding Account Failed";
		}
		
		return msg;
	}

}
