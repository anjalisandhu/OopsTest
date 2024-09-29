package FiveLstTraverse;

public class Program1 {

	public static void main(String[] args) {
		
		String str ="anjali07@#$%";
		int count = 0;

		
		String specialcharacterremove="";
		
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i))&& !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
			}
		else {
			
			specialcharacterremove	= specialcharacterremove + str.charAt(i);
			
		}
		}
		
		if(count ==0) {
			System.out.println("there are no special character");
		}
		else {
			System.out.println("special character found is "+count);
		}
		
		System.out.println("String after removing special character "+specialcharacterremove);
	} 
	
}
