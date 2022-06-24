
public class Ch5Q2 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int j = 19;
		for(int i = 1; i <= 10; i++) {
			a[i] = j;
			j = j * 19;
			
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
