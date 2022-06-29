
public class Ex2 {

	public static void main(String[] args) {

		int[] num = new int[5];
		try {
			System.out.println("in try1");
			errorMethod(num);
			System.out.println("in try2");
		}
		
		catch(Exception ex) {
			System.out.println("in catch");
		}
		System.out.println("rest of program.");
	}
	
	public static void errorMethod(int[] num) {
		num[10] = 25;
	}

}
