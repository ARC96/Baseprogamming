package p5.array;

import java.util.Arrays;

public class permution {
	
	public static void main(String[] args) {		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 at p5.array.permution.main(permution.java:8)
		//args[0]="rc";		
//		String s=args.toString();
//		StringBuffer sb;
//		s="hell0";
//		System.out.println(s.length());
		char c[]= {'a','b','c'};
		//Swamping..
		for (int i = 0; i < c.length; i++) {
			char temp;		
			temp=c[1];
			c[1]=c[2];
			c[2]=temp;			
			System.out.println(Arrays.toString(c));
			//System.out.println(c+" ");	
			   
		    }
				
}}

    
