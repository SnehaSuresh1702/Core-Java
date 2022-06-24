
public class NestedForEx {

	public static void main(String[] args) {
		
		/*for(int i = 1; i <= 3; i++) {//outer for loop
			
			for(int j = 1; j <= 2; j++) {//inner for loop
				System.out.println(i + " " + j);
			} //inner for ends
			
		} //outer for ends */
		

	
	
	//NestedFor Ex2
	for(int i = 1; i <= 5; i++) { //outer loop
		for(int j = 1; j <=i ; j++) { //inner loop
			System.out.print("+");
		}
		System.out.println(); //Print new line after inner loop completes all its iterations.

	}
	}
} //main method ends	
