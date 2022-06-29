
public class Ex1 {

	public static void main(String[] args) {

		int[] num = new int[5];
		try {
			System.out.println("in try1");
			num[10] = 25;
			System.out.println("in try2");
		}
		
		catch(Exception ex) {
			System.out.println("in catch");
		}
		System.out.println("rest of program.");
	}

}
