package p2.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_2 {

	public static void main(String[] args) throws IOException {
 
		
		/*
		 * Two Way Communication
		 */
		
		ServerSocket listener=new ServerSocket(5000);
		System.out.println("ready");
		Socket sss=listener.accept();
		
		//receivce
		InputStream is=sss.getInputStream();
		DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readUTF());
        
        //sent 
        Scanner s=new Scanner(System.in);
        OutputStream os=sss.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF(s.nextLine());
        
	    dos.close();
	    os.close();
	    s.close();
        dis.close();
        is.close();
        sss.close();
        listener.close();
	}

}
