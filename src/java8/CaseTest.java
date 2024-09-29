package java8;

import java.util.stream.Collectors;

public class CaseTest {
public static void main(String[] args) {
	String name= "AnJalI";
	String result = name.chars().mapToObj(c->(char)c).map(c-> Character.isUpperCase(c)? Character.toLowerCase(c):Character.toUpperCase(c))
	.map(String::valueOf).collect(Collectors.joining());
	
	System.out.println(result);
}
}
