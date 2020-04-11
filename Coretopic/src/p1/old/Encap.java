class Book
{

    //instances variables
	String  indexNo;
    private int pgNo;


    //System.out.println(indexNo);--->error <identifier> expected ***

	
     
   //access contorl
   void setNum(int pgNo)

	{
	   System.out.println(indexNo);
	   if(pgNo>0)
		{
		   this.pgNo=pgNo;//shadowsing problem....."pgNo=pgNo"
	    }

		else
	    {
          System.out.println("invaild");
		}
   }
   
   int getNum()
	{
	   return this.pgNo;
	}


//constuctor args and user defined constuctor
   Book(int pgNo)
    {
       this.pgNo=pgNo;
	   System.out.println(this.pgNo);
	}
   // empty const
   Book()
	{
      
	}
}

// main class
class Encap 
{
	public static void main(String[] args) 
	{
        Book b=new Book();
		b.indexNo="XI";	         
		b.setNum(01);
		b.setNum(-10);
	    System.out.println(b.getNum());

		//const call
		Book c=new Book(31);
	}
}
