
public class ForEach5 {

	public static void main(String[] args) {

		//2-D array
		char [][] vowels = {
						{'a', 'A'}, 
						{'e', 'E'},
						{'i', 'I'},
						{'o', 'O'},
						{'u', 'U'}
		};
				
		//nested regular for loops to print all the elements in 2-D array
		for(int i = 0; i < vowels.length; i++){
			for(int j = 0; j < vowels[i].length; j++) {
				System.out.print(vowels[i][j]+ "\t"); 
			}
			System.out.println(); //Print a new line after inner loop 
		}
				
		System.out.println("-------------------");
				
		//nested for-each loops to print all the elements in 2-D array
		for(char [] rows : vowels) {
			for ( char col : rows) {
				System.out.print(col + "\t"); 
			}
			System.out.println(); //Print a new line after inner loop 
		}
	}

}
