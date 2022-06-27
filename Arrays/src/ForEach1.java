
public class ForEach1 {

	public static void main(String[] args) {
		
		//Primitive 1-D array
		int [] arr = {10, 20, 30};
		for(int x : arr) { 
			System.out.println(x);
		}
				
		//Object 1-D array
		String [] names = {"Jack", "Joe", "John"};
		for(String name : names) { 
			System.out.println(name);
		}
	}

}
