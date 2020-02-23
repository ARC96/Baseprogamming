package com.p1;

abstract class Outer
{
	private static int a=30;
	private static int b=30;
	int c;
	
	Outer()
	{
		this.c=10;
	}
	
//object creation not possible  become the this inner class...
	static class Inner
	{
	   public void disp() {
		   System.out.println(a);
		   System.out.println(b);
	}
	}
}

public class Inner_StaticNested {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	   Outer.Inner call =new Outer.Inner();
	   call.disp();

	}

}
