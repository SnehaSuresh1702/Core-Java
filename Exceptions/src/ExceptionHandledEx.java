
public class ExceptionHandledEx {

	public static void main(String[] args) {

		int[] n = {4, 8, 16, 32};
		int[] d = {2, 0, 4, 4};
		
		for(int i = 0; i < n.length; i++) {
			try {
				System.out.println(n[i]/d[i]);
			}
			catch(ArithmeticException ex){
				System.out.println("Cant divide by zero!");
			}
		}	
			
	}

}
