package FiveLstTraverse;

import java.util.Iterator;

public class Program {
public static void main(String[] args) {
	
	String str ="anjali07@#$%";
	int count = 0;

	for(int i=0;i<str.length();i++) {
		if(!Character.isLetter(str.charAt(i))&& !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
			count++;
		}
	}
	
	if(count ==0) {
		System.out.println("there are no special character");
	}
	else {
		System.out.println("special character found is "+count);
	}
	
}
}
