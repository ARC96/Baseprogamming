package p1.old;

import java.util.ArrayList;
import java.util.ListIterator;


class  A
{
	public static void main(String[] args) 
	{

     ArrayList a=new ArrayList();
	 a.add(10);
	 a.add(10);
	 a.add(10);

	 ListIterator l=a.listIterator(a.size());

     while(l.hasPrevious())
		{
		System.out.println(l.hasPrevious());
		}
	}
}
