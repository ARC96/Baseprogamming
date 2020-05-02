package p2.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {

	public static void main(String[] args) throws IOException {
 
		
		/*
		 * One Way Communication
		 */
		
		ServerSocket listener=new ServerSocket(5000);
		Socket sss=listener.accept();
		InputStream is=sss.getInputStream();
		DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readUTF());
	  
        dis.close();
        is.close();
        sss.close();
        listener.close();
	}

}
