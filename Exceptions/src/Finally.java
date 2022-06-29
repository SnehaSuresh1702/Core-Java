
public class Finally {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		try {
			System.out.println("in try1");
			num[10] = 25;
		}
		
		catch(Exception ex) {
			System.out.println("in exception");
		}
		finally {
			System.out.println("finally block");
		}
	}

}
