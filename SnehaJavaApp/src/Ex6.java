
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colorCode = "R";
		switch (colorCode) {
			case "R":
			case "r": 
				System.out.println("Traffic light is RED.");
				break;
			case "O":
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "G":
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
		}
	}

}
