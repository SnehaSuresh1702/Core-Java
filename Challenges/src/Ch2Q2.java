import java.util.Scanner;

public class Ch2Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int upb = scan.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= upb) {
			sum = sum + i;
			i++;	
		}
		System.out.print(sum);
		
	}

}
