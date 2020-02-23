package com.p1;

class Outers
{
	   public void disp() {
		   
		 //only method inside
		     
		    class Inner
		     { 
		    	int a=10;
		    	int b=02;
		    	}
		    
		    Inner a=new Inner();
		   System.out.println(a.a);
		   System.out.println(a.b);
	      
	}
}
public class Inner_MethodLocal {

	public static void main(String[] args) {
		Outers o=new Outers();
		o.disp();

	}

}

