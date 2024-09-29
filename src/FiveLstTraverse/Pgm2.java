package FiveLstTraverse;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.Collections;

public class Pgm2 {
public static void main(String[] args) {
//	int a =10;
//	int b =20;
//	System.out.println(a+b+" is result");
//	System.out.println("a+b is" +a+b);
	
	
	int[][] arr = new int[3][];
	arr[0]= new int[] {1,2};
	arr[1]= new int[] {4,5,6,7};
	arr[2]= new int[] {7,8,9};
	System.out.println(arr[1][2]);
	
	
	ArrayList l1= new ArrayList(5);
	l1.add("Anjali");
	ArrayList t1= new ArrayList(3);
	t1.add("a");
	t1.add("b");
	t1.add("c");
	
	
	l1.addAll(t1);
	l1.remove("b");
	//l1.removeAll(t1);
	l1.retainAll(t1);
	
	System.out.println(l1.contains("d"));
	l1.clear();
	System.out.println(l1);
	System.out.println(l1.isEmpty());

	System.out.println(	l1.size());
	
	 
	System.out.println(t1);
	
}
}
