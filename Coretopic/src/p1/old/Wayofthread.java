import java.util.*;
class Wayofthread 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
        Check1 c1=new Check1();
		 Check2 c2=new Check2();
		  Check3 c3=new Check3();

		  c1.start();
		  c2.start();
		  c3.start();

		  c1.join();

		  System.out.println(c1.isAlive());
		  System.out.println(c2.isAlive());
		  System.out.println(c3.isAlive());


		  System.out.println("end");

	}
}


class Check1 extends Thread 
{
  public void run()
	{
   //System.out.println("thread1");
   
  
    }





}


class Check2 extends Thread 
{
  public void run()
	{
  
  System.out.println("thread2");
  
    }





}


class Check3 extends Thread 
{
  public void run()
	{
  
  System.out.println("thread3");
  
    }





}