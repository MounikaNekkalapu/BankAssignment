package com.example.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.model.CustomerAccounts;
import com.example.manager.model.Manager;
import com.example.manager.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	
    @Autowired  
	ManagerService service;
    
    @GetMapping("/all")
    public List<CustomerAccounts> findAllCustomerAccounts(){
		return service.findAllCustomerAccounts();
    	
    }
}
