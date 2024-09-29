package exampleString;


public class Cases {
public static void main(String[] args) {
	 String name = "anJAli";
	//String result ="";
	 
	 StringBuilder result =new StringBuilder();
	 
	  
	  for (char c : name.toCharArray()) {
		  if(Character.isUpperCase(c)) {
			 // result += Character.toLowerCase(c);
			  result.append(Character.toLowerCase(c));
			  
		  }
		  else if(Character.isLowerCase(c)){
			// result += Character.toUpperCase(c);
			  result.append(Character.toUpperCase(c));
		  }
		
	}
	System.out.println(result);
}
}
