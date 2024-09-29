package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Xyz {
public static void main(String[] args) {
	List<Integer> lst = new ArrayList<Integer>();
	lst.add(5);
	lst.add(2);
	lst.add(50);
	lst.add(4);
	lst.add(5);
	System.out.println(lst);
//	Collections.sort(lst.reversed());
//	System.out.println(lst);
	
	Collections.sort(lst,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0 );
	System.out.println(lst);
	
}
}
