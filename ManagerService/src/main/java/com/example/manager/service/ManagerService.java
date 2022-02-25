package com.example.manager.service;

import java.util.List;
import java.util.Optional;

import com.example.manager.model.CustomerAccounts;
import com.example.manager.model.Transactions;

public interface ManagerService {
	public List<CustomerAccounts> findAllCustomerAccounts();
	public String insertNotes(CustomerAccounts Customeraccounts,String accttype);
	public String deleteNotes();
	public Optional<Transactions> findByttype(String ttype);
}
