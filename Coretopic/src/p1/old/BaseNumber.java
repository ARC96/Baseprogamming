package p1.old;

import java.util.*;
class BaseNumber 
{
	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
	   System.out.println("Enter the Number:");
	   int n=s.nextInt();
//1.add the first  n  number
        /*int sum=0;
	      for(int i=1; i<=n; i++)
		  {sum=sum+i;}
	   	  System.out.println(sum);*/


//2.multiple the first n number
        /* int mul=1;
	       for(int i=1; i<=n; i++)
		   {mul=mul*i;}
	   	   System.out.println(mul); */


//3.factor of first n number  OR  
         /* for(int i=1; i<=n; i++)
		     {if(n%i==0)
			     {System.out.println(i);}}*/
 
  //other way **
		/* System.out.println(1);
		 for(int i=2; i<=n/2; i++)
		     {if(n%i==0)
			     {System.out.println(i);}}
         System.out.println(n);  */


//4.add  the factor  for n number
     /*int sum=0;
	 for(int i =1; i<=n; i++)
		{
         if(n%i==0)
			{
			 sum=sum+i;
			}
			System.out.println(sum);
       }*/


//5.count the factor of n number
    /* int count=0;
	  for(int i =1; i<=n; i++)
		{
         if(n%i==0)
			{
			 count++;
			}}
			System.out.println(count); */


//6.prime number for n number
      int count=0;
      for(int i =1; i<=n; i++)
		{if(n%i==0)
			{
			 count++;
			}}
	  if(count==2) 
		{System.out.println("prime");}
	  else
		 {System.out.println("not prime");} 

 //other way
	 /* int count=0;	
      for(int i =2; i<=n/2; i++)
		{if(n%i==0)
			{
			 count++;
             System.out.println(count);
			 break;
			}}
	  if(count==0)
		{System.out.println("prime");}
	  else
		 {System.out.println("not prime");} */





















	}
}
