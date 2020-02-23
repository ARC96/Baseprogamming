package com.p1;

 public abstract class AbstractClass {

	//**Object creation is Impossible...
	
	int a;
	abstract void does1();
	
  public static void does2() 
	    {
		  System.out.println("Method 2");
	    }
	AbstractClass()
	{
	    
	}
	
	
	public static void main(String[] args) {
		
		
		does2();

	}
}


