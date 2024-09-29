package FiveLstTraverse;

import java.util.StringJoiner;

public class Program3 {
public static void main(String[] args) {
	StringJoiner sJoiner =new StringJoiner(",","[","]") ;
	sJoiner.add("A").add("B").add("C");
	System.out.println(sJoiner);
	
	StringJoiner sJ =new StringJoiner(":") ;
	sJ.add("P").add("Q");
	System.out.println(sJ);
	System.out.println(sJoiner.merge(sJ));
	
}
}
