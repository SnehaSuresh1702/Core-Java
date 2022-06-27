
public class FibanocciSeries {

	public static void main(String[] args) {

		if(args.length != 1) { //If user has not provided one command-line argument
			System.out.println("Please provide one argument for the no. of elements in Fibonacci series");
			return; //End the program, don't proceed.
		}
		System.out.println("Count is: " + args[0]);
		int count = Integer.parseInt(args[0]); 
		
		int[] fib = new int[count]; 
		fib[0] = 0; //First member of the series is always 0
		fib[1] = 1; //Second member of the series is always 1

		// Store the values in fib array
		for (int i = 2; i < count; i++) { 
			fib[i] = fib[i - 1] + fib[i - 2]; 
		}

		// Print the values from fib array
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
	}

}
