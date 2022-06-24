
public class ContinueEx {

	public static void main(String[] args) {
		
		//Numbers divisible by 5 without using continue
		/*for(int i = 0; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}*/
		
		//Numbers divisble by 5 using continue
		/*for(int i = 0; i <= 100; i++) {
			if(i % 5 != 0) {
				continue;
				
			}
			System.out.println(i);
		}*/
		
		//Search the number of times this number appears.
		int searchForNum = 24;
		int count = 0; 
		outer:
		for(int row = 1; row <= 100; row++) {
			inner:
			for(int col = 1; col <= 10; col++) {
				int num = row * col;
					if(num == searchForNum) {
						count++; //if number is found, increase the count.
							if(col == 1) {
								break outer;//if number is found, and it is first column of the row, then come out of the outer loop
							}
							continue outer; //if number is found, continue with the next iteration of outer loop
					}
			} //inner for ends
		} //outer for ends
				
		System.out.println(searchForNum + " appears " + count + " times.");
		
	}
}
