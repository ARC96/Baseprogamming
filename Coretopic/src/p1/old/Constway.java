package p1.old;

class  Constway
{
	public static void main(String[] args) 
	{
	   Set2  s=new Set2(10,20,30,40);
	   Set3  s1=new Set3(80,60,70,50);

	}
}

class Set1
{
	int a;
	int b;

  
 Set1 (int a,int b)
	{
      this.a=a;
	  this.b=b;
    
	  System.out.println(this.a);
	  System.out.println(this.b);

	 }

 // empty const class for super() used this one
 Set1()
	{
	}


}

//super() call to parent class const
class Set2 extends Set1
{
	int c;
	int d;


Set2 (int a,int b,int c,int d)
{  
  super(a,b);
 
  this.c=c;
  this.d=d;

  System.out.println(this.c);
  System.out.println(this.d);

}
}

class Set3 extends Set1
{
    int c;
	int d;

Set3(int a,int b,int c,int d)
{  
  this(a,b);
 
  this.c=c;
  this.d=d;

  System.out.println(this.c);
  System.out.println(this.d);
}

Set3(int a,int b)
{
  this.a=a;
  this.b=b;

  System.out.println(this.a);
  System.out.println(this.b);


}
}











