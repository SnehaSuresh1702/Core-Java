
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colorCode = "r";
		switch (colorCode) {
			case "R":
				System.out.println("Traffic light is RED.");
			case "r":
				System.out.println("Traffic light is RED.");
			case "O":
				System.out.println("Traffic light is ORANGE.");
			case "o":
				System.out.println("Traffic light is ORANGE.");
			case "G":
				System.out.println("Traffic light is GREEN.");
			case "g":
				System.out.println("Traffic light is GREEN.");
			default:
				System.out.println("Invalid color code.");
		}
	}

}
