
public class _1DEx {
	public static void main(String[] args) {
		
		int [] a; //Declare an int array
		a = new int[4]; //Instantiate an int array object of 4 elements
		
		
		//Print all the array elements before assigning the values
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		
		//Assign values to array elements.
		a[0] = 85; 
		a[1] = 70; 
		a[2] = 95; 
		a[3] = 90; 
		
		//Print all the array elements after assigning the values
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		
		// Leads to Exception
		//scores[4] = 100;
	}
}
