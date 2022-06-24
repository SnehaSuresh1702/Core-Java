
public class Grt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte hour = 8;

		// 1. if hour is less than 12 noon, greet with Good Morning.
		if (hour < 12) {
			System.out.println("Good Morning");
		}
		// 2. if hour is greater than or equal to 12 noon but less than 15 (3 PM), greet with Good Afternoon
		else if (hour < 15) {
			System.out.println("Good Afternoon");
		}
		// 3. if hour is greater than or equal to 15 (3 PM), greet with Good Evening
		else {
			System.out.println("Good Evening");
	}

}
}