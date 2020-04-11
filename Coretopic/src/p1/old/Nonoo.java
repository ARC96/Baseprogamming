import java.util.Scanner;

class Nonoo 
{
	public static void main(String[] args) 
	{
      Rectangle r=new Rectangle();
	  Square s=new Square();
      Circle c=new Circle();
      Collector co=new Collector();

	  
	            
      //ref call
	  co.access(r);
      co.access(s);
      co.access(c);
	
	}
}


//achieved poly... 
class Collector 
{
public	void  access(Angle ref)
	{
		ref.accessInput();
		ref.compute();
		ref.display();
	}
}



//parent class
abstract class Angle
{
float area;
int length;

abstract void accessInput();
abstract void compute();
abstract void display();



//abstarct can allow the constructor 
Angle(int length)
	{
       this.length=length;
     }

Angle()
	{
      this(10);
	}

}


//child class
class Rectangle extends Angle
{
 //int length,breath;
 int breath;
 //int area;


public void accessInput()
	{
      Scanner scan = new Scanner(System.in);
      //System.out.println("what is Rectangle length");
      //length=scan.nextInt();
      System.out.println("what is Rectangle breath");
	  breath=scan.nextInt();
    }
public void compute()
	{
      area=length*breath;
    }
public void display()
	{
      System.out.println("Rectangle:"+area);
	}
}


//child class
class Square extends Angle
{
//int length;
//int area;

public void accessInput()
	{
      //Scanner scan = new Scanner(System.in);
      //System.out.println("what is Square length");
      //length=scan.nextInt();
    }
public void compute()
	{
      area=length*length;
    }
public void display()
	{
      System.out.println("Square"+area);
	}
}



//child class
class Circle extends Angle
{
 float radius;
// float area;

public void accessInput()
	{
      Scanner scan = new Scanner(System.in);
      System.out.println("what is Circle radius");
      radius=scan.nextInt();
    }
public void compute()
	{
      area=3.14f*(radius*radius);
    }
public void display()
	{
      System.out.println("Circle"+area);
	}

 }