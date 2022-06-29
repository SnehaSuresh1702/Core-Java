
public class DivByZero1 {

	public static void main(String[] args) {

		method1(); 
		System.out.println("main ends.");
	}
	
	private static void method1() {
		int i = 0;
		try {
			System.out.println(23 / i); 
		}catch(ArithmeticException ex) {
			//System.out.println("Cant divide by zero");
			//System.out.println(ex.getMessage());
			//ex.printStackTrace();
			System.out.println(ex);
		}
	
	
	}

}
