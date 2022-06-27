
public class ForEach3 {

	public static void main(String[] args) {

		int [] arr = new int [3];

		// Loop to assign 50 to all the array elements.
		/*for(int i = 0; i < arr.length; i++){
			arr[i] = 50;
		}*/
		
		//Assign 50 to all the array elements using for-each loop
		for(int x : arr){
			x = 50;
		}
		
		//Enhanced for loop to print all the array elements
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
