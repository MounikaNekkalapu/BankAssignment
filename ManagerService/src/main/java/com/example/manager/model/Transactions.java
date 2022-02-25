package com.example.manager.model;

public class Transactions {
	 public int tid;
     public String ttype;
     public String amount;
     public String date;
     
     public Transactions() {
    	 
     }

	public Transactions(int tid, String ttype, String amount, String date) {
		super();
		this.tid = tid;
		this.ttype = ttype;
		this.amount = amount;
		this.date = date;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
     
}
