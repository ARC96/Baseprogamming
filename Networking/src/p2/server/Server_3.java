package p2.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_3 {

	public static void main(String[] args) throws IOException {
 
		
		/*
		 * two Way Communication with N message passing....
		 */
		
		ServerSocket listener=new ServerSocket(5000);
		Socket sss=listener.accept();
		System.out.println("ready");
		
		for(int i =1; i<=5;i++)
		{        //receivce
				InputStream is=sss.getInputStream();
				DataInputStream dis=new DataInputStream(is);
		        System.out.println(dis.readUTF());
		        
		        //sent 
		        Scanner s=new Scanner(System.in);
		        OutputStream os=sss.getOutputStream();
		        DataOutputStream dos=new DataOutputStream(os);
		        dos.writeUTF(s.nextLine());
	    
		}
		
       
        sss.close();
        listener.close();
	}

}
