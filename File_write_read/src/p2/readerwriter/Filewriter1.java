package p2.readerwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter1 {
	
	/*
	 * 1.)WAP to take n names from the user and write all the names inside a file in separate lines.
	 */
	
	 public static void main(String[] args) throws IOException {
		
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter no of users:");
		  int n=s.nextInt();
		  
		  /*
		   * Create a FileWriter object
		   */
		  
		  FileWriter fw=new FileWriter("H:\\IDE _Eclipse\\File_handle\\output\\O_file1.txt");
		  
		  
		  for (int i = 1; i <= n; i++) {
			
			  String user=s.next();
		//	  fw.write(user+"\n");
			  fw.write(user+" ");
			 
		}
		  
		  fw.flush();
		  fw.close();
		  
	}
	
	
	

}
