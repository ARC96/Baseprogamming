package p1.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Preparestatment {
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

			
		 prst=con.prepareStatement("SELECT * FROM user1 WHERE name=?");
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter Name:");
		 prst.setString(1,s.nextLine());
		 res=prst.executeQuery();
		 
		 System.out.println();
		 while(res.next()==true)
		 {
			 name=res.getString(1);
			 phone=res.getString(2);
		 }
		 System.out.println(name+""+phone );
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
