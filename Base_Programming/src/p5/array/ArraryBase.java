package p5.array;

import java.util.Arrays;

public class ArraryBase {

	public static void main(String[] args) {
		//1D - regular(int)
	      //creation.
		int []a=new int[5];
		  //insert..
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=24;
		a[4]=25;
		System.out.println(a.length);
		  //access...
		for(int i=0;i<=a.length-1;i++)
		{
           System.out.print(a[i]+" ");

		}
		//or
		System.out.println(Arrays.toString(a));
		System.out.println("");
		 
		
		//2D - regular(int)
		System.out.println("2D arrray..");
	      //creation.
		  int [][]aa=new int[5][5];
		  //insert..
		   for(int i=0;i<=aa.length-1;i++)
		   {
			for(int j=0;j<=aa.length-1;j++)
			{
               aa[i][j]=j;
			}

		   }
		System.out.println(aa.length);
		  //access...
		  for(int i=0;i<=aa.length-1;i++)
		  {
		   for(int j=0;j<=aa.length-1;j++)
		   {
			System.out.print(aa[i][j]+" ");
		   }
		   System.out.println(" "); 
		  }
		//or
		System.out.println(Arrays.deepToString(aa));
	     

	}

}
