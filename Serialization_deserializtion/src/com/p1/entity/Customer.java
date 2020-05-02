
package com.p1.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	/*
	 * It's for Selective Serialization
	 * transient String name;
	 */
	String name;
	int crn;
	double balance;
  //  long ww;
	
	
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
	
	/*
	 * for Selective serialiZation using serialiZable interface 
	 * 
	 */
	
	private void  writeObject(ObjectOutputStream oos) throws IOException
	{
		oos.writeInt(crn);
		oos.writeDouble(balance);
	}
	

	private void  readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		 crn =ois.readInt();
		 balance=ois.readDouble();
	}
	
	
	
	
	
	
}
