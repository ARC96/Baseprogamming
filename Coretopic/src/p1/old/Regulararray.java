import java.util.*;

class Regulararray 
{
	public static void main(String[] args) 
	{  
		Scanner scan=new Scanner(System.in);
		//1D array - declare
		int []a=new int[5];
		System.out.println("length of 1D array it is no of columns");
	    System.out.println(a.length);//get the array length

		//2D arrray -declare
		int [][]b=new int[5][5];
		System.out.println("length of 2D array it is 0'th row no of columns ");
	    System.out.println(b[0].length);//get the array length

		//3D array -declare
		int [][][]c =new int[2][5][4];
		System.out.println("length of 3D array it is 0'th block and 1st rows there no of columns");
	    System.out.println(c[0][1].length);//get the array length


        //1D array Store
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the 1st set students mark");
			a[i]=scan.nextInt();
		}

		 //2D array Store
		for (int i=0;i<=b.length-1;i++)
		{  
			for(int j=0; j<=b[i].length-1;j++)
		    {
			System.out.println("enter the 2nd set students mark");
			b[i][j]=scan.nextInt();
			}
		}

        //3D array store
		for (int i=0;i<=c.length-1;i++)
		{  
			for(int j=0; j<=c[i].length-1;j++)
		    { 
				for(int k=0; k<=c[i][j].length-1;k++)
				{
			      System.out.println("enter the 3nd set students mark");
			      c[i][j][k]=scan.nextInt();
				}
			}
		}


        //1D array access
		for(int i=0;i<=a.length-1;i++)
	    {
        System.out.println("enter the 1st set students overall mark desktop");
		System.out.println(a[i]);
		}

		//2D array access
		for (int i=0;i<=b.length-1;i++)
		{  
			for(int j=0; j<=b[i].length-1;j++)
		    {
			System.out.println("enter the 2nd set students mark desktop");
		    System.out.println(b[i][j]);
			
			}
		}

		  //3D array access
		for (int i=0;i<=c.length-1;i++)
		{  
			for(int j=0; j<=c[i].length-1;j++)
		    { 
				for(int k=0; k<=c[i][j].length-1;k++)
				{
			     System.out.println("enter the 3nd set students mark desktop");
		         System.out.println(c[i][j][k]);
				}
			}
		}

	}
}
