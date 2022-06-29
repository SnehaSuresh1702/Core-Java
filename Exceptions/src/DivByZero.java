
public class DivByZero {

	public static void main(String[] args) {

		method1(); 
		System.out.println("main ends.");
	}
	
	private static void method1() {
		int i = 0;
		System.out.println(23 / i); 
	}

}
