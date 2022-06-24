
public class ArrayIteration1 {

	public static void main(String[] args) {
		
		int[] a = new int[7];
		
		int j = 10;
		for(int i = 0; i < a.length; i++) {
			a[i] = j;
			j = j + 10;
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
