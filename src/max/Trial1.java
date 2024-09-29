package max;


	
	
	interface A {
		public void getName(String name);
	}

	public class Trial1 {

		public static void getInfo(String info) {
			System.out.println(info);
		}

		public static void main(String[] args) {
			A a = (String ss) -> System.out.println(ss); //providing implementation of getName(String name) using Lambda Expression
			a.getName("Anjali");
			

			A a1 = Trial1::getInfo; // refering to pre-existing getInfo(String info) of class Test as arguments are same as getName(String name)
			a1.getName("getInfo() of Test class is executing");
			
			
			
		}
	}

