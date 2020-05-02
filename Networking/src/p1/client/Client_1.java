package p1.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * One Way Communication
		 */
		
		// create of Socket
		Socket css=new Socket("localhost", 5000);

		
		OutputStream os=css.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF("Hello");
		
		dos.close();
		os.close();
		css.close();

	}

}
