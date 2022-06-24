
public class BreakEx {

	public static void main(String[] args) {
		
		/*for(int i = 1; i <= 100000; i++) {
			System.out.println(i);*/
		
		
		// Use of Break
		/*int upperBound = 20;
		
		for(int i = 1; i <= 100000; i++) {
			System.out.println(i);
			if(i == upperBound) {
				break;
			}
		}*/
		
		//Without break
		//outer:
		/*for(int row = 1; row <= 100; row++){
			
			inner:
			for(int col = 1; col <= 10; col++) {
				int num = row * col;
				System.out.print(num + "\t");
			}
			System.out.println();
		}*/
			//With break (by default takes inner loop)
		
		   /* int stopAt = 24;
			outer:
				for(int row = 1; row <= 100; row++){
					
					inner:
					for(int col = 1; col <= 10; col++) {
						int num = row * col;
						System.out.print(num + "\t");
						if(num == stopAt) {
							break;
						}
					}
					System.out.println();
				}	*/
			
			//To break from outer loop
			int stopAt = 24;
			outer:
				for(int row = 1; row <= 100; row++){
					
					inner:
					for(int col = 1; col <= 10; col++) {
						int num = row * col;
						System.out.print(num + "\t");
						if(num == stopAt) {
							break outer;
						}
					}
					System.out.println();
				}	
			
	}

}
