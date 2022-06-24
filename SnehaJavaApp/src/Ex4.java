
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colorCode = "a";
		switch (colorCode) { //Use of String in switch expression was allowed from Java 7 onwards
			case "R":
				System.out.println("Traffic light is RED.");
				break;
			case "r":
				System.out.println("Traffic light is RED.");
				break;
			case "O":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
			case "G":
				System.out.println("Traffic light is GREEN.");
				break;
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
		}
	}

}
