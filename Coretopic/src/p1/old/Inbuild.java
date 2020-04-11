class Inbuild //String object
{
	public static void main(String[] args) 
	{  
		String s1="RAMA";
	    String s5=new String("sita");

		//+operater via add the strings.
		String s6=s1+"SITA";
		System.out.println(s6);
        //RAMASITA

        //concat() is add the strings  placed on heap seg..
	    String s4=s1.concat("SITA");
		System.out.println(s4);
		//RAMASITA

        //toUpperCase() is lowercase to uppercase..
	    String s2=s5.toUpperCase();
		System.out.println(s2);
		//SITA
 
        //toLowerCase() is uppercase to lowercase...
		String s3=s1.toLowerCase();
		System.out.println(s3);
		//rama

		//length() is length of given string..
		System.out.println(s1.length());
		System.out.println(s4.length());
		// 4 8

        //indexOf() find the index value
		System.out.println(s4.indexOf('A'));
		System.out.println(s4.lastIndexOf('A'));
        // 1 7

        //charAt() return the  char
		System.out.println(s4.charAt(4));
		// S

		//substring() return the complete string
		System.out.println(s4.substring(4));
	    System.out.println(s4.substring(4,8));
		//SIIA  SITA 

        //contains() check the string
		System.out.println(s1.contains("RAVANA"));
        //False
 
        //startsWith() just check the string
		System.out.println(s4.startsWith("RAMA"));
		System.out.println(s1.endsWith("SITA"));
		// ture  false

        //toCharArray() return the complete string
		System.out.println(s4.toCharArray());
        //RAMASITA

        //isEmpty() check the string
		System.out.println(s1.isEmpty());
		//false

        //intern() given the ref of scp seg
		System.out.println(s5.intern());
		//sita


	}
}
