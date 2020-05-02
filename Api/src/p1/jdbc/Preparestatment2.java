package p1.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Preparestatment2 {
	/*
	 * frist Create the DataBAse  with Table : user --> name(varchar), Phone(varchar)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/user";
		String user="root";
		String pwd="system";
		Connection con;
		PreparedStatement prst;
		ResultSet res;
		
		String  name=null,phone=null;
		
		try {
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("driver load....");
			
			
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("connection....");
			
			
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name:");
			System.out.println("Enter the phone:");
			
			// insert into db
			
			prst=con.prepareStatement("INSERT INTO user1 VALUES(?,?)");
			prst.setString(1,s.nextLine());
			prst.setString(2,s.nextLine());
	        int insert=prst.executeUpdate();
	        
	        if(insert==1)
	        {
	        	System.out.println("Done!!!");
	        }
	        else
	        {
	        	System.out.println("problem");
	        }
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
