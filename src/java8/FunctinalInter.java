package java8;

import java.util.logging.Logger;


public interface FunctinalInter {

	
	Logger logger = Logger.getLogger(FunctinalInter.class.getName());

	
	public void abstractFun(int x);
	
	default void normalFun() {
		//System.out.println("hlo");
		
		logger.info("hlo");
	}
}

