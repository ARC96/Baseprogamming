class Sbinbuilt 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer(50);
		StringBuffer sb3=new StringBuffer("RAMASITARAVANA");

		//append() store the string--- present StringBuffer class
		System.out.println(sb1.append("RAMASITA  RAMASITA"));
        //RAMASITA  RAMASITA

		//length() is stringlength count-- both
		System.out.println(sb3.length());
        //14

		//charAt() return the char-- both
	    System.out.println(sb3.charAt(9));
		//A

        //setCharAt() REPLACE the char--present StringBuffer class  
        sb3.setCharAt(9,'O');
		//RAMASITAROVANA

		//insert() just insert the char not replace--present StringBuffer class 
		System.out.println(sb3.insert(9,'H'));
		//RAMASITARHOVANA

		//deleteCharAt() just delete the char--present StringBuffer class
		System.out.println(sb3.deleteCharAt(9));
		//RAMASITAROVANA

		//delete() delete complete string--present StringBuffer class
	    System.out.println(sb3.delete(4,10));
		//RAMAVANA

		//reverse() just reverse the string
		System.out.println(sb3.reverse());
		//ANAVAMAR

		//ensureCapacity() declare the size after object creation---present StringBuffer class
		sb2.ensureCapacity(100);
        //100

        //trimToSize() is unuseable place removed--present StringBuffer class
		sb1.trimToSize();
        //18

		//capacity() is capacity of the stringbuffer--present StringBuffer class
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
	}
}
