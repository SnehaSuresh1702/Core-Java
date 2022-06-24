
public class ArraysEx3 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		
		/*for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}*/
		
		
		// More Readable print statement
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
			}
		}	
	}
}
