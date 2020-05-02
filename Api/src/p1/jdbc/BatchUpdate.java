package p1.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * frist Create the DataBAse  with Table : user --> name(varchar), Phone(varchar)
		 */

	
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
				
				
				
				
				
				/*
				 * In jdbc Commit Always True.. 
				 * we manunaly set False
				 */
				con.setAutoCommit(false);
				
				prst=con.prepareStatement("INSERT INTO user1 VALUES(?,?)");
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the no of entity:");
				int n=s.nextInt();
				
				
				// insert into db
				for (int i=0; i<n;i++)
				{
				System.out.println("Enter the name:");
				String name=s.next();
				System.out.println("Enter the phone:");
				String phone=s.next();
				
				
				prst.setString(1,name);
				prst.setString(2,phone);
				
				/*
				 * it's help to store into intermedium blocks before DB storage
				 */
				prst.addBatch();
				}
		      
				
				/*
				 * one Short to stroing into DB
				 */
				
				int[] n1=prst.executeBatch();
				
				/*
				 *  commit method is  save to DB
				 */
		        con.commit();
		        
		        
		      
				s.close();
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			prst.close();
			con.close();

	}


}
