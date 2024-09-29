package exampleString;

import javax.naming.spi.DirStateFactory.Result;

public class Case3 {
public static void main(String[] args) {
//	program 1
//String name="anjali";
//name= name+" sandhu";
//System.out.println(name);
	
	
//	program 2
//	String name ="anjali";
//	name= name.concat(" sandhu");
//	System.out.println(name);
	

//	program 3
//	String name ="anjali";
//	name.concat(" sandhu");
//	System.out.println(name);
	
	//program 4
	String str1 = new String("anjali");
	System.out.println(str1);
	
	//program 5
	char[] c = {'a','b','c','d'};
	String str2 = new String(c);
	System.out.println(str2);

	
	//program 6
	byte[] b = {23,56,89,67};
	String str3 = new String(b);
	System.out.println(str3);
	
	
//    program 7
//	String[] st = {"anu","kapil","manoj"};
//	String s = new String(st);
//	System.out.println(s);
//	
//	Result ------The constructor String(String[]) is undefined
//
//	at exampleString.Case3.main(Case3.java:36)
}


}
