
public class Ch4Q4 {

	public static void main(String[] args) {
		
		outer:
		for(int row = 1; row <= 8; row++){
						
			inner:
			for(int col = 1; col <= 8; col++) {
				
				if( row % 2 != 0 && col % 2 != 0) {
					
					System.out.print("W" + " ");
				}
				else if(row % 2 == 0 && col % 2 == 0) {
					System.out.print("W" + " ");
					
				}
				else
					System.out.print("B" + " ");
			}
			
			System.out.println();
	
	}
}
}