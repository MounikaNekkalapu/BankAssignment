package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.customer.model.Customer;
import com.example.customer.model.Transactions;
import com.example.customer.repo.CustomerRepo;
import com.example.customer.repo.TransactionRepo;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
    private CustomerRepo repo;
	
	@Autowired
	private TransactionRepo tranrepo;
	
	@Autowired
	RestTemplate template;
	
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Inserted successfully";
	}

	public Optional<Transactions> findByttype(String ttype, String amount) {
		// TODO Auto-generated method stub
		return tranrepo.findByttype(ttype,amount);
	}

	public List<Transactions> findByttype(String ttype) {
		// TODO Auto-generated method stub
		return tranrepo.findByttype(ttype);
	}

     
}
