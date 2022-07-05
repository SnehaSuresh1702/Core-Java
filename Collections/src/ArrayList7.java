import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al);
		
	}

}
