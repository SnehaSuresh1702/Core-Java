
public class Ch7Q2 {

	public static void main(String[] args) {

		int tableOf = 7;
		int [] arr = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
		
		/*for(int i = 0; i < arr.length; i++ ) {
			
				System.out.println("7*" + arr[i] + "=" + 7*arr[i]);
			
		}*/
		
		for(int x : arr) {
			
			System.out.println("7*" + x + "=" + 7*x);
		
	}	
		}
	

}
