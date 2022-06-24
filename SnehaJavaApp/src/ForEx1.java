
public class ForEx1 {

	public static void main(String[] args) {
		
		// initialized and declared in the same line
		for(int ctr = 0; ctr < 2; ctr++) {
			System.out.println("Hello");
		}
		
		System.out.println("------------");
		// initialized and declared in the different line
		int i;
		for(i = 0; i < 2; i++) {
			System.out.println("Hello");
		}
		
		//Infinite loop and no conditions inside the for loop
		/*for(;;) {
			System.out.println("Welcome");
		}*/
		
		//Infinite loop with literal
		/*for(;true;) {
			System.out.println("Welcome");
		}*/
		

	}

}
