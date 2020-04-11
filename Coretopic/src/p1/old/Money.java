import java.util.*;
class Money 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		     b.initiate();
	}
}



class Bank
{
	void initiate()
	{
	Atm a=new Atm();

	try
	{
	 a.acceptableInput();// first try....
	 a.verify();        //
	}
	catch (Exception e)
	{
		try
		{
		  a.acceptableInput();// 2nd try....
	      a.verify();        //	
		}
		catch (Exception r)
		{
			try
			{
			 a.acceptableInput();// 3nd try....
	         a.verify();        //		
			}
			catch (Exception t)
			{
			 System.exit(0);
			}
		}
	}
	}
}



class Atm
{
 private int    username;
 private int    password;
 int un,pw;


 Atm()
	{
      this.username=1234567890;
	  this.password=1010;
     }

 void acceptableInput()
	{
     Scanner scanner = new Scanner(System.in);
	 System.out.println("enter  the userName");
        un = scanner.nextInt();
        System.out.println("enter  the password");
        pw = scanner.nextInt();
		}

 void verify()throws WrongPasswordException
	{
     if(username==un&&password==pw)
		{
	     System.out.println("collect money");
	    }
		else
			{
		     WrongPasswordException wpe=new WrongPasswordException();
	         System.out.println(wpe.getMessage());
			 throw wpe;
             }
	 }
}




class WrongPasswordException extends Exception
{
   public String getMessage()
	{
	 return "INVALID";
    }
}