package p1.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ResultUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/user";
		String user="root";
		String pwd="system";
		Connection con=null;
		PreparedStatement prst=null;
		
		try {
			Driver d=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("driver load....");
			
			
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("connection....");
			
			
			System.out.println(" UPDATE MARKS  ");
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
