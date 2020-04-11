package p2.readerwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter_prog2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 2)WAP to take multiple user name and phone number from the user and 
		 *   write all the names inside a file named as name.txt(O_file1.txt) and
		 *   write all the phone numbers in different file named as phone number.text(O_file2.txt).
		 *   
		 */
		
		FileWriter name=new FileWriter("H:\\IDE _Eclipse\\File_handle\\output\\O_file1.txt");
		FileWriter phoneno=new FileWriter("H:\\IDE _Eclipse\\File_handle\\output\\O_file2.txt");
		
		Scanner a=new Scanner(System.in );
		System.out.println("Enter name and phoneno:");
		for (int i = 1; i <=a.nextInt(); i++) {
			 name.write(a.next()+" ");
			 phoneno.write(a.next()+" ");
		}
		name.flush();
		phoneno.flush();
		name.close();
		phoneno.close();

	}

}
