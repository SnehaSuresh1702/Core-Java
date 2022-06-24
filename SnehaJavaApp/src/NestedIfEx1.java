
public class NestedIfEx1 {

	public static void main(String[] args) {

		int age = 15;
		double height = 45; //height in inches
		
		if(age >= 10){ //outer if
			if(height >= 45) //inner if
				System.out.println("Enjoy Indiana Jones Adventure ride");
		} else //corresponding to outer if, when age is less than 10
			System.out.println("Sorry, Your age is less than 10.");
		
		System.out.println("-----------------------------------------------");
		
		//Curly brackets are missing for outer if.
		if (age >= 10) // outer if
			if (height >= 46) // inner if
				System.out.println("Enjoy Indiana Jones Adventure ride");
			else // corresponding to inner if, when height is less than 46.
				System.out.println("Sorry, Your age is less than 10.");
	}

}
