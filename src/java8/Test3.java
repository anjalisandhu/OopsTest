package java8;

import org.apache.log4j.Logger;

public class Test3 {
 //private final static Logger kkkk= Logger.getLogger(Test3.class.getName());
	private final static Logger hh= Logger.getLogger(Test3.class);
	
	interface FunInter1 {
		 
		int operation(int a, int b);
	}
	
	interface FunInter2 {
		void sayMessage(String message);
	}
	
//	private int operate(int a ,int b , FunInter1 fobj ) {
//		return fobj.operation(a, b);
//	}
	
	public static void main(String[] args) {
		
		FunInter1 add = (int x , int y) ->  x+y;
		
		//System.out.println(add.operation(2, 5));s
		hh.info("add operation "+add.operation(2, 5));
		
		
		
		FunInter2 message = m -> System.out.println(m);
		message.sayMessage("hlo anjali");
	}
	
}
