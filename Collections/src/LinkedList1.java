import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;// added
import java.util.Scanner;
public class LinkedList1 {

	public static void main(String[] args) throws IOException {

		/*LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20.5);
		ll.add(30);
		ll.add("Java");
		ll.add(50);
		System.out.println(ll);*/
		
		List lines = new ArrayList();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Project File\\Test.txt"))) {
				while(br.ready()) {
					lines = Arrays.asList(new Scanner(new File("C:\\Project File\\Test.txt")).useDelimiter("|").next().split("\\r?\\n"));
					System.out.println(lines);
				}
				//for(int i= 0; i<line.size();i++) {
				
			//}
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}

