package FiveLstTraverse;

public class Pgm {
public static void main(String[] args) {
	
//	// remove c 
//	String str ="Cloud TeCh";
//	System.out.println(str.replaceAll("C", ""));
	
	String str ="Cloud TeCh";
	// char ch ='C';
	removechar( str, 'C');
}

public static void removechar(String str, char c) {
	int n=str.length();
	String finalStr ="";
	
	for(int i=0;i<str.length();i++) {
		
		if (str.charAt(i) != c) {
			finalStr = finalStr + str.charAt(i);
			
		}
		
	}
	System.out.println(finalStr);
}
}
