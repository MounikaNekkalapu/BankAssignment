package com.example.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.manager.model.CustomerAccounts;
import com.example.manager.model.Transactions;
import com.example.manager.repo.ManagerRepo;

public class ManagerServiceImpl implements ManagerService{
     
	@Autowired
	ManagerRepo repo;
	
	@Autowired
	RestTemplate template;

	public List<CustomerAccounts> findAllCustomerAccounts() {
		// TODO Auto-generated method stub
		return findAllCustomerAccounts();
	}

	public String insertNotes(CustomerAccounts Customeraccounts, String accttype) {
		// TODO Auto-generated method stub
		return "inserted successfully";
	}

	public String deleteNotes() {
		// TODO Auto-generated method stub
		return "deleted successfully";
	}

	public Optional<Transactions> findByttype(String ttype) {
		// TODO Auto-generated method stub
		return findByttype(ttype);
	}

	
	
}
