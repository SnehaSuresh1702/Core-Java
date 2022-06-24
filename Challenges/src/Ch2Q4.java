import java.util.Scanner;

public class Ch2Q4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int end = scan.nextInt();
		
		
		while( i <= end) {
			if(i % 2 != 0) {
				System.out.print(i);
			
			}
			i++;
			
		if(i != end && i % 2 != 0)	{
			System.out.print(",");
		}
			
			
			
		}
				
}
}