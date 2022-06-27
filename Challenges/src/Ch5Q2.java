
public class Ch5Q2 {

	public static void main(String[] args) {
		
		/*int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int j = 19;
		for(int i = 0; i <= 9; i++) {
		
			j = i * 19;
			a[i] = j;
			
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}*/
		
int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int j = 19;
		for(int i = 0; i <= 9; i++) {
		
			j = (i+1) * 19;
			a[i] = j;
		}	
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}
