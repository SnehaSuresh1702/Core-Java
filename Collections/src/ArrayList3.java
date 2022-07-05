import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.subList(0, 3));
		
		System.out.println(al.indexOf(30));
		
		al.add(30);
		System.out.println(al);
		System.out.println(al.indexOf(30));
		
		System.out.println(al.lastIndexOf(30));
		
		
		
	}

}
