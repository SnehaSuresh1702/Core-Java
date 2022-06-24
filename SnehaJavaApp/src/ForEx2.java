
public class ForEx2 {

	public static void main(String[] args) {
		
		for( int i = 0;i < 2; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for( int i = 0;i < 2; ) {
			System.out.println(i++);
		}
		
		System.out.println("----------");
		
		// Without statement inside for loop
		for( int i = 0;i < 2; System.out.println(i++) ) {

		}
	}

}
