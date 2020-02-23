
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoi {
	
	public static  void main(String [] args ) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("H:\\Eclipse\\sample.txt");
		fos.write(1996); //Ì
		fos.close();
		
		FileInputStream fis=new FileInputStream("H:\\Eclipse\\sample.txt");
		System.out.println(fis.read());//206
		fis.close();
		
		
		//?????
		FileInputStream fis1=new FileInputStream("H:\\Eclipse\\sample.txt");
		System.out.println((char)fis1.read());
		fis1.close();
		
		
	}

}
