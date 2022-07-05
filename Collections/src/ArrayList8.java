import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.contains(50));
		System.out.println(al.contains(99));
		
		ArrayList b = new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		System.out.println(b);
		System.out.println(al.containsAll(b));
		
		System.out.println(b.getClass());
		
	}

}
