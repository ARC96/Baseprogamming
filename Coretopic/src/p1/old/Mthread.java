import java.util.*;
class Mthread 
{
	public static void main(String[] args) 
	{
	
     Atm a=new Atm();
	 Bankname b=new Bankname();
	 Count c=new Count();

	 Demo d=new Demo();
	 d.start();
	  
	//multi-thread create   
	   a.start();
	    b.start();
		c.start();
		c.run(20);



   //we create the thread object
   
   Demo1 d1=new Demo1();
         // d1.start()-------> it's not possible thread object is not created....
   Thread t1=new Thread(d1);
          t1.start();




 //get the current thread
 Thread t=Thread.currentThread();
 System.out.println(t);		 
		
	}
}


//activty 1
class Atm extends Thread //thread object creation use "is-a"
{
	public void run()
	{
	System.out.println("start the atm");   
	Scanner s = new Scanner(System.in);
     System.out.println("username");   
	    String un = s.nextLine();
	 System.out.println("password");   
	    int pw = s.nextInt();

	//user defind Exception handlder	
		try{
			Thread.sleep(3000);//InterruptedException it's checked exception
		   }
		catch(InterruptedException e)
	       {
	        }

	 System.out.println("$$MONEY$$"); 
	 System.out.println("end the atm"); 


	  Thread a1=Thread.currentThread();
      System.out.println(a1);	
	}   
}



//activty 2

class Bankname extends Thread
{
	public void run()
	{
	 System.out.println("start bank");
	 
	 for(int i=0;i<=5;i++)
		{
	     System.out.println("THANKS");

         //user defind Exception handlder	
		try{
			Thread.sleep(3000);//InterruptedException it's checked exception
		   }
		catch(InterruptedException e)
	       {
	        }
	    }
	 System.out.println("end bank");

	}
}



//activty 3

class Count extends Thread
{
 public void run() 
  {
   System.out.println("start count");
   int a=1000 ,b=30000;
   int c=a+b;
   try{
			Thread.sleep(3000);//InterruptedException it's checked exception
		   }
		catch(InterruptedException e)
	       {
	        }
   System.out.println(c);
   System.out.println("end count");
  }

//overloading method  start() only call the run() without parameters
    public void run(int number) 
     {
	   
	   }
	 public void run(float number) 
     {
	     }
  
}


// this case we can't create the  manually  the thread object
class Demo  extends Bankname  implements Runnable
{
   public void run(){
   
      int a =0;
       System.out.println(a);
   }


}




// we create the thread object
class Demo1 implements Runnable
{
   public void run(){
   
      int a =2;
	  int b=3;
	  int c=a+b;
       System.out.println(c);
   }


}



