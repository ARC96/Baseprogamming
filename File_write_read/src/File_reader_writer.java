import java.io.*;

public class File_reader_writer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("H:\\Eclipse\\sample.txt");
		//fw.write("/n");
		fw.write(14);
		fw.write("/n");//----->		
		char c[]= {'a','b','c'};
		fw.write(c);
		fw.write("/n");
		fw.write("1st return");
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader("H:\\Eclipse\\sample.txt");
		//it can display char wise
//		System.out.println((char)fr.read());
//		System.out.println(fr.read(c));
//		
		
		//?????
		System.out.println((char)fr.read());
		int i=fr.read();
		if(i!=0)
		{
		System.out.println((char)fr.read());
		i=fr.read();
		}
		
		fr.close();
		

	}

}
