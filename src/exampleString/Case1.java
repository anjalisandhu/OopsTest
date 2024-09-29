package exampleString;

import java.util.Random;

public class Case1 {
public static void main(String[] args) {
	String name ="Komal";
	//Mal@1234
	
	Random random =new Random();
	System.out.println(name.substring(2, 5)+"@"+random.nextInt(9000));
}
}
