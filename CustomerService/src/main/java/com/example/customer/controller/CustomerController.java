package com.example.customer.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.customer.model.Transactions;
import com.example.customer.service.CustomerService;


public class CustomerController 
{
	 @Autowired  
		CustomerService service;
	    
	    @GetMapping("/all")
	    public List<Transactions> findByttype(String ttyp){
			return service.findByttype(ttyp);
	    	
	    }        
}
