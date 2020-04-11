class Instancearea 
{
	public static void main(String[] args) 
	{
	   Demoinstance i=new Demoinstance();
	                i.m2();

	   int k =Demostatic.m5();
	   System.out.println(k);

	   System.out.println("inside main()");
	}
}


//instance area
class Demoinstance extends Demostatic
{
  
  //instance variable
  int i;


  //instance block
	{
	  m1();
	  System.out.println("inside instance block");

	}

  //instance method
  void m1()
	{
	 System.out.println("inside instance methed ");
	 System.out.println(i);
	 System.out.println(j);


	}
	void m2()
	{
	 i=1;
	 j=2;
	 System.out.println("inside instance methed 2");
	 System.out.println(i);
	 System.out.println(j);
	}


  //instance variable
  int j;

}




//static control flow....& extends m-l inheritance
class Demostatic extends Demo
{ 
  //Static variable
  static int i=30;



  //static block
  static
	{
  	  m4();
  	  System.out.println("I'm static block");
  
    }


  //static method
  static void m4()
	{
	  System.out.println("I'm static method ");
	  System.out.println(i);
	  System.out.println(j);
	}
   static int m5()
	{
	  int l;
      System.out.println("I'm static method 2 ");
	  System.out.println(j);
	  //i=i-30; // become  -30
	  l=i-30;
	  return l;
	}


	//Static variable
	static int j=20;

}



//const 
 class Demo
{   
  int g;
  Demo (int g)
	{
  	  this.g=g;
  	  System.out.println("I'm const");
	  System.out.println(this.g);
    }			
  Demo ()
	{
	 System.out.println("I'm no args const");
    }
}