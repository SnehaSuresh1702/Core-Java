
public class _1DfindAvg {

	public static void main(String[] args) {
		
		/*int [] scores = new int[5];
		scores[0] = 85;
		scores[1] = 70;
		scores[2] = 95;
		scores[3] = 90;
		scores[4] = 90;*/
		
		int[] scores = new int[] {85, 70, 95, 90, 90};
		//int avgScore = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5;
		//System.out.println("Average Score of 5 students: " + avgScore);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
			
		}
		int avgScore = sum / scores.length;
		System.out.println("Average Score of " + scores.length + " students: " + avgScore);
		
		
	}

}
