package p1.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_3 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * One Way Communication
		 */
		
		// create of Socket
		Socket css=new Socket("localhost", 5000);

		for(int i =1; i<=5;i++)
		{
		Scanner s=new Scanner(System.in);
		OutputStream os=css.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF(s.nextLine());
		
		InputStream is=css.getInputStream();
		DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readUTF());
		}
		
		css.close();

	}

}
