package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(3);
		System.out.println("stream list: "+lst1.stream().distinct().toList());
		System.out.println("stream count list: "+lst1.stream().distinct().count());
		
		
		
		 Object[] array = Stream.of(1,2,3,4,5,4,3).distinct().toArray();
		 
		for(Object x:array) {
			System.out.println(" Iterate using enhanced for loop "+x);
		}
		
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Iterate using traditional for loop "+array[i]);
		}
		
	
		
		Arrays.stream(array).forEach(System.out::println);
		
		
		
		
		lst1.forEach( x-> {
			System.out.println("for each method "+x);
		});
		
		//lst1.stream().distinct().toList().forEach(n->{System.out.println(n);});
		
		lst1.forEach(t-> System.out.println("lambda expression used to print: "+t));
		lst1.forEach(b->{
			if(b % 2 ==0) {
				System.out.println("lambda expression to extract even no "+b);
			}
		});
		System.out.println("lst 1: "+lst1);
		
		
		List<Integer> lst2 = List.of(1,2,3,4);
		lst2.add(6);
		System.out.println("lst 2 "+lst2);
		
		List<Integer> lst3 = Arrays.asList(1,2,3,4);
		lst3.add(8);
		System.out.println("lst 3 "+lst3);
		
		
		
	}

}
