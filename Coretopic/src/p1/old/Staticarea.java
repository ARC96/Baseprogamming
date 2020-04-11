//main class

class Staticarea 
{
	public static void main(String[] args) 
	{

		//by creating the object of a class
		Demostatic1  d=new Demostatic1(10);

		//static call
		Demostatic.m2();
		int k=d.m2();
		System.out.println(k);



		Demostatic  d1=new Demostatic();
					d1.m3(); 

		
		System.out.println("I'm main method");
	}
}


//by extends to call static
class Demostatic1 extends Demostatic
{   
  int g;
  Demostatic1 (int g)
	{
  	  this.g=g;
  	  System.out.println("I'm const");
	  System.out.println(this.g);
    }			
  Demostatic1 ()
	{
    }
}



//static control flow....
class Demostatic 
{ 
  //Static variable
  static int i=30;



  //static block
  static
	{
  	  m1();
  	  System.out.println("I'm static block");
  
    }


  //static method
  static void m1()
	{
	  System.out.println("I'm static method ");
	  System.out.println(i);
	  System.out.println(j);
	}

  static int m2()
	{
	  int l;
      System.out.println("I'm static method 2 ");
	  //System.out.println(j);
	  //i=i-30; // become  -30
	  l=i-30;
	  return l;
	}


  //just put
 void m3()
  	{
  	    System.out.println(j);
  
  	}


	  
	//Static variable
	static int j=20;



   // System.out.println(j);



}













































































				
											 