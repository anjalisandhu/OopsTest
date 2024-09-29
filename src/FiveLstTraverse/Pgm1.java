package FiveLstTraverse;

import java.util.Arrays;

public class Pgm1 {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int arr1[] = {5,4,3,2,1};
	if(areEqual(arr,arr1)) {
		System.out.println("two arrays are equals");
	}
	else {
		System.out.println("two arrays not equal");
	}
}

public static boolean areEqual(int[] arr , int[] arr1) {
	
	
	int n =arr.length;
	int n1 = arr1.length;
	if(n!=n1) {
	return false;
	}
	Arrays.sort(arr1);
	Arrays.sort(arr);
	
	for(int i=0;i<n;i++) {
		if(arr[i]!=arr1[i]) {
			return false;
			
		}
	}
	return true;
}
}
