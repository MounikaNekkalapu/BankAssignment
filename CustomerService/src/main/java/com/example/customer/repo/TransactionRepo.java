package com.example.customer.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Transactions;
@Repository
public interface TransactionRepo extends JpaRepository<Transactions, Integer>{

	Optional<Transactions> findByttype(String ttype, String amount);

	List<Transactions> findByttype(String ttype);
      
}
