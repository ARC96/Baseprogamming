package com.p1.process;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.p1.entity.Customer;

public class SerializtionLaunch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fos=new FileOutputStream("H:\\IDE _Eclipse\\File_handle\\output\\O_file1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Customer c=new Customer("Aravind",7701,5000.32);
        oos.writeObject(c);
	}

}
