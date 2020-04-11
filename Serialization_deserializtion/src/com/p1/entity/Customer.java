
package com.p1.entity;

import java.io.Serializable;

public class Customer implements Serializable {

	String name;
	int crn;
	double balance;
	
	
	public Customer(String name, int crn, double balance) {
		this.name = name;
		this.crn = crn;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public int getCrn() {
		return crn;
	}


	public double getBalance() {
		return balance;
	}
	
	
	
	
}
