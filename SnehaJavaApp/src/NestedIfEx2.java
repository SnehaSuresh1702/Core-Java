
public class NestedIfEx2 {

	public static void main(String[] args) {
		
		int duration = 3;
		if(duration > 2) //1
			if (duration > 4) //2
				if(duration < 7) //3
					System.out.println("A");
			else //3
				System.out.println("B");
		else //2
			System.out.println("C");
	}

}


