
public class ArraysEx {

	public static void main(String[] args) {

		int [][] arr = new int [3] [];
		
		System.out.println(arr); 
		System.out.println(arr[0]); 
		System.out.println(arr[1]); 
		System.out.println(arr[2]); 
		
		arr[0] = new int [2];
		System.out.println(arr[0]); 
		System.out.println(arr[0][0]); 
		
		arr[1] = new int [3];
		System.out.println(arr[1]); 
		System.out.println(arr[1][2]); 
		
		arr[0][0] = 20; 
		arr[1][2] = 30; 
		
		System.out.println(arr[0][0]); 
		System.out.println(arr[1][2]); 
		
		
		//arr[2][1] = 50;
	}

}
