package com.p1.process;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.p1.entity.Customer;

public class S_prog2  {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * WAP to Seletive Serialization 
		 */
		
		FileOutputStream fos=new FileOutputStream("H:\\IDE _Eclipse\\File_handle\\output\\O_file1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n of Customers:");
        int n=s.nextInt();
        
        for (int i = 1; i <=n; i++) {
			System.out.println("enter the name ,crn and balance:");
			Customer c= new Customer(s.next(),s.nextInt(),s.nextDouble());
			oos.writeObject(c);
		}

	}


}
