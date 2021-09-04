package com.demo.hcl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping
	public List<BankDetails> getListAccDetails(){
		
		List<BankDetails> bankData = new ArrayList<>();
		
		return bankData;
		
	}
	
	@PostMapping
	public String addFavAccount(){
		String msg = "";
		
		
		return msg;
		
	}

}
