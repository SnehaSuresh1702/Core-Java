
public class ForEach2 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];

		// Regular for loop 
		/*for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}*/
		
		// Enhanced for loop s
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
