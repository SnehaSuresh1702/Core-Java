
public class Ch4Q3 {

	public static void main(String[] args) {

		outer:
		for(int row = 1; row <= 10; row++){
					
			inner:
			for(int col = 1; col <= 10; col++) {
				int num = row * col;
					System.out.print(num + "\t");
				}
			System.out.println();
		}
	}

}
