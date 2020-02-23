package com.p1;

class Bank
{
	private int accno=1212;
	private int pwd=1234;
	
	//nested class only for outer class  data member access...	
	class Inner
	{
		public void disp() {
			System.out.println(accno);
			System.out.println(pwd);
		}
	}
	
}

public class Inner_nested {
	
	public static void main(String []args) {
		
		Bank.Inner call=new Bank().new Inner();
	    call.disp();
	}

}
