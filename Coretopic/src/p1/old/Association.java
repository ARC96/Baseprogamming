package p1.old;

class Association 
{
	public static void main(String[] args) 
	{     
       Boy b=new Boy();
       Exam sem=new Exam("FAIL");
       System.out.println(b.h.getStatus());
	   b.hasA(sem);


	   b=null;
	   sem.getResult();
      // System.out.println(b.h.getStatus());
	}
}

class  Boy
{
 Heart h=new Heart("Love"); 
 
 void hasA(Exam sem)
	{
     System.out.println(sem.getResult());
    }

}


class  Heart
{
   String status;
   
   Heart(String status)
   {
    this.status=status;
   }
   String getStatus()
   {
    return status;
   }

    
}


class  Exam
{
   String status;
   
   Exam(String status)
   {
    this.status=status;
   }
   String getResult()
   {
    return status;
   }


}





