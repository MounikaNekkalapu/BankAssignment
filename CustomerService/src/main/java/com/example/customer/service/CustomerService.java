package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transaction;

import com.example.customer.model.Customer;
import com.example.customer.model.Transactions;

public interface CustomerService {
	public String insertCustomer(Customer customer);
	public Optional<Transactions> findByttype(String ttype,String amount);
	public List<Transactions> findByttype(String ttype);  
}
