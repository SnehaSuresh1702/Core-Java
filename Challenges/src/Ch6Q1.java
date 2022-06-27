
public class Ch6Q1 {

	public static void main(String[] args) {

		int[][] a = new int[8][8];
		int count = 1;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				
				System.out.print(count + "\t");
				count++;
			}
			//count++;
			System.out.println();
		}
	}

}
