import java.util.*;

class  Exceptions
{
	public static void main(String[] args) 
	{    
		static int c;
		System.out.println("start point");
		Scanner s=new Scanner(System.in);
        try{
			System.out.println("enter the 1 st num");
		       int a=s.nextInt();
		    System.out.println("enter the 2 nd num");
		        int b=s.nextInt();
				 c=a/b;//exception occured line
				//System.out.println(c);
		   }
		 catch(Exception e)//expce object is e and exception type 
		{
		 System.out.println("exception area");
		}
        System.out.println(c);// this line can't execute because varaible defined in inside try block.....
	    System.out.println("end point");

	}
}
