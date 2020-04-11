package p1.old;


import java.util.TreeSet;

//improt.java.util*;

public class Complextreeset {
	
	public static void main(String[]args)
	{
		Student s1=new Student("ram",   001);
		Student s2=new Student("sri",   002);
		Student s3=new Student("siva",  005);
		Student s4=new Student("durga", 004);
		Student s6=new Student("vasa",  003);
		
		TreeSet ts=new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s6);
		
		System.out.println(ts);
		
	}
	
}

class Student implements Comparable
{
	String name;
	int sid;
	
	
    //constcutor
	Student(String name,int sid)
	{
		this.name=name;
		this.sid=sid;	
	}
	
	
    public int compareTo(Object obj1)
    {
    	// base on id
    	//int sid1=this.sid;
        //Student  s=(Student)obj1;
    	//int sid2=s.sid;
    	
    	
    	//based on String data
    	String name1=this.name;
        Student  s=(Student)obj1;
    	String name2=s.name;
    	
    	
    	if(name1<name2)
    	{
    		return -1;
    	}else if(name1>name2) 
    	{
    		return +1;
    	}else
    	{
    		return 0;
    	}	
    }
    
    
    
    //get vlaue
    public String toString()
    {
     	return name+""+sid;	
    }
}
