
public class Ch6Q2 {

	public static void main(String[] args) {

		int[][] a = new int[8][8];
		
		for(int i = 0; i < a.length ; i++){
							
			for(int j = 0; j < a[i].length; j++) {
					
				if( i % 2 != 0 && j % 2 != 0) {
						
					System.out.print("W" + " ");
				}
				else if(i % 2 == 0 && j % 2 == 0) {
					System.out.print("W" + " ");
						
				}
				else
					System.out.print("B" + " ");
			}
				
				System.out.println();
		}
	}
}
	
