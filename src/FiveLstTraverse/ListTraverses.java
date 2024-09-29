package FiveLstTraverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraverses {
public static void main(String[] args) {
	
	List<String> liststr = new ArrayList<>();
	liststr.add("ram");
	liststr.add("sita");
	liststr.add("geeta");
	liststr.add("john");
	
	// simple loop(apply only where indexing is present )
	for (int i=0;i<=liststr.size()-1;i++) {
		System.out.println(liststr.get(i));
	}
	System.out.println("------------- for each----------");
	
	// enhance for each (apply on all collection , list , set , hasset)
	
	for(String str:liststr) {
		System.out.println(str);
	}
	
	System.out.println("-------------iterator-----------");
	//using Iterator(using iterator we traverse in forward direction)
	Iterator<String> itr=liststr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	// Listiterator used to traverse in forward and backward direction and listiterator apply on object of Arraylist, linkedlist,vector
	ListIterator<String> listIterator= liststr.listIterator();	
	while (listIterator.hasNext()) {
		String lst = (String) listIterator.next();
		System.out.println("traverse list using list iterator "+lst);
		
	}
	
	System.out.println("-------------iterator backward direction-----------");
	
	ListIterator<String> reverselist= liststr.listIterator(liststr.size());
	while (reverselist.hasPrevious()) {
		String rvrslist = reverselist.previous();
		System.out.println(rvrslist);
		
	}
	
	// java 8 --- foreach
	System.out.println("-----for each-------");
	
	liststr.forEach((s)-> {System.out.println(s);});
	
	
	
	

	
}
}
