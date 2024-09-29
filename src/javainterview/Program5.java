package javainterview;

public class Program5 {
	
	public static void main(String[] args) {
//		// count number of digit in integer
//		int i =12345;
//		String str =Integer.toString(i);	
//	System.out.println(str.length());
		
		int i =12345;
		
		int count =0;
		
		while(i>0) {
			count++;
			i=i/10;
		}
		
		System.out.println(count);
		
	}


}
