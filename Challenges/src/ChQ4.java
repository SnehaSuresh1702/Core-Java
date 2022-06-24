
public class ChQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = -1;
		
		if( score <= 100 && score > 0) {
		
		String s = (score > 60) ? (score >= 90) ? "Distinction ": "Pass" : "Fail" ;
		System.out.println(s);
		
		}
		
		else
			System.out.println("Enter valid number");
	}
}
