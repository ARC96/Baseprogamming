class Uml 
{
	public static void main(String[] args) 
	{
		Cargoplane 	 cp=new Cargoplane();
		             cp.takeOff();
		             cp.carry();
					 cp.land();

	  		System.out.println(cp.maxseat);
			         cp.takeOff();

						}
}


class Aplane
{
 int minseat=10;
 int maxseat=50;
		   
}

class Plane extends Aplane
{

  int minseat=5;
  int maxseat=10;


  void takeOff()
	{
	 System.out.println(super.maxseat);
	 System.out.println("take off");
    }
  void land()
	{
	System.out.println("land");
    }
}


class Cargoplane extends Plane
{
  void takeOff()
	{
	 System.out.println(super.minseat);
	 System.out.println("Cargoplane is slowly take off");
    }
 void carry()
	{
	 System.out.println("Cargoplane carrys goods");
    } 
}


class Fighterplane extends Plane
{
  void takeOff()
	{
	 System.out.println("Fighterplane is fastly take off");
    }
 void carry()
	{
	 System.out.println("Fighterplane carrys weapons");
    } 
  
}


class Passplane extends Plane
{
  void takeOff()
	{
	 System.out.println("passplane is medium take off");
    }
  void carry()
	{
	 System.out.println("passplane carrys passagers");
    }
  
}


