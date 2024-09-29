package max;



	
	interface B {
	    public  void add(int x, int y);
	}

	
	public class Trial3 {
		
		
		class Addition {
			public void sum(int a, int b) {
			    System.out.println("The sum is :"+(a+b));
			}
		}


		public static void main(String[] args) {
			
			// Create an instance of the outer class
	        Trial3 trial = new Trial3();

	        // Create an instance of the inner class using the outer class instance
	        Addition addition = trial.new Addition();
			
			
			//*** Using Lambda Expression ***//
			B b1 = (a,b) -> System.out.println("The sum is using lambda :"+(a+b));
			b1.add(10, 14);
			
			//*** Using Method Reference ***//
			B b2 = addition::sum;
			b2.add(100, 140);
		}
	}
	

