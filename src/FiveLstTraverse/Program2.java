package FiveLstTraverse;


// to find the rotation
public class Program2 {
public static void main(String[] args) {
	String str ="ABCD";
	
	
	
	String str2 ="CDAF";
	
	if(isRotation(str, str2)) {
		System.out.println("string Rotation is present");
	}
	else {
		System.out.println("Rotation not found");
	}
}
public static boolean isRotation(String str,String str2) {
	return (str.length()== str2.length()) && ((str+str).indexOf(str2)!=-1);
	}
	
	
}
