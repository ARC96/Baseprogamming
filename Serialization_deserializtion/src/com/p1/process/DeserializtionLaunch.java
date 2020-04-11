package com.p1.process;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.p1.entity.Customer;

public class DeserializtionLaunch {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
        FileInputStream fis=new FileInputStream("H:\\IDE _Eclipse\\File_handle\\output\\O_file1.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);
        
        Customer c=(Customer) ois.readObject();
        
        
        System.out.println(c.getName()+"\n"
                           +c.getCrn()+"\n"
        		           +c.getBalance());

	}

}
