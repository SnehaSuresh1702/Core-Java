
public class _1DEx2 {

	public static void main(String[] args) {
		
		 
		String[] a = new String[5]; //Declare and Instantiate a String array object of 5 elements
		
		
		//Print all the array elements before assigning the values
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		
		//Assign String objects to array elements.
		a[0] = "Jack"; 
		a[1] = "Lucy"; 
		a[2] = "Joe"; 
		a[3] = "John"; 
		a[3] = "Kate"; 
		
		//Print all the array elements after assigning the values
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		System.out.println(a[4]); 
		
		// Leads to Exception
		//scores[4] = 100;
	}

}
