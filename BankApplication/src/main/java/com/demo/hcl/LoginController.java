package com.demo.hcl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.domain.BankDetails;
import com.demo.hcl.service.AccountService;

@Controller
public class LoginController{
	
	@Autowired
	AccountService accService;
	
	@RequestMapping("login")
	public String getloginPage(HttpServletRequest req, HttpServletResponse resp){
		
		return "login";
	}
	
	@RequestMapping("fetchAccDetails")
	public ModelAndView getListAccDetails(HttpServletRequest req, HttpServletResponse resp){
		
		List<BankDetails> bankData = new ArrayList<>();
		ModelAndView mv = null;
		String pin = req.getParameter("pin").toString();
		System.out.println(pin);
		if(pin.equals("1111")) {
			mv = new ModelAndView("home.jsp");
			mv.addObject("accounts", bankData);
			
		}else {
			mv = new ModelAndView("login.jsp");
			mv.addObject("accounts", bankData);
			mv.addObject("msg", "Pin Validation Failed");
		}
		
		return mv;
		
	}
	
	@RequestMapping("addAccount")
	public String addFavAccount(HttpServletRequest req, HttpServletResponse resp){
		String msg = "";
		
		return msg;
		
	}

}
