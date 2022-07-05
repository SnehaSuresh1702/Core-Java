import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		ArrayList b = new ArrayList();
		b.add(20);
		b.add(40);
		System.out.println(b);
		
		al.retainAll(b);
		System.out.println(al);
		
	}

}
