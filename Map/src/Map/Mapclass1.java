package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapclass1 {

	public static void main(String[] args) {
		
     HashMap m=new HashMap();
		
	    m.put(1,10);
	    m.put(2,20);
	    m.put(3,30);
	    m.put(4,40);
	    m.put(5,50);
	    m.put(6,60);
	    m.put(7,10);
	    m.put(8,20);
	    System.out.println(m);
	    Set s1=m.entrySet();
	    System.out.println(s1);
	    
	    
	    
	    Iterator ir=s1.iterator();
	    
	    while(ir.hasNext())
	    
	    {
	    	Map.Entry m1 = (Map.Entry) ir.next();
	    	
	    
	    	 if (m1.getValue().equals(10))
	    	 {
	    		 
	    		 Object s2 = m1.setValue(14);
	    		 System.out.println(m);
	    		 
	    	 }
	    	 
	    	// System.out.println("after iterator");

	    	 //System.out.println(s1);
	    	
	    	
	    }


	}

}
