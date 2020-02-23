package com.p1;

public class Start_singletonclass {
	
   private static Start_singletonclass s;
	
	public static Start_singletonclass getString()
	{
		if (s==null) {
			s=new Start_singletonclass();
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start_singletonclass s1=Start_singletonclass.getString();
		Start_singletonclass s2=Start_singletonclass.getString();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
}