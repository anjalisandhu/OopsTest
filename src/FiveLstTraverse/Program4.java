package FiveLstTraverse;

import java.util.HashSet;
import java.util.Set;

public class Program4 {
public static void main(String[] args) {
	int arr1[] = {80,10,15,2,35,60};
	int arr2[] = {35,80,60,20,75};
	printCommonelement(arr1,arr2);
	
}

public static void printCommonelement(int arr1[], int arr2[]) {
	
	Set<Integer> s = new HashSet<Integer>();
	for(int i=0;i<arr1.length;i++) {
		s.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++) {
		if(s.contains(arr2[i]))
		{
			System.out.println("common element from two array is "+arr2[i]);
		}
	}
	
	
}
}
