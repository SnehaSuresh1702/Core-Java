package com.assessment.Sneha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HomePage implements Runnable {
public void run() {
		try {
			Methods.report();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void display() throws IOException{
		
		System.out.println("Menu:");
		System.out.println("*************Order Management System*************");
		System.out.println("1. Add Order");
		System.out.println("2. View Order List");
		System.out.println("3. View By Order Id");
		System.out.println("4. Sort Order");
		System.out.println("5. Delete Order By Id");
		System.out.println("6. Mark as Delivered");
		System.out.println("7. Cancel Order");
		System.out.println("8. Generate Report");
		System.out.println("9. Exit");
		System.out.println();
		
		System.out.println("Choose Option:");
		
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		
		switch(menu)
		{
			case 1: Methods.addOrder();
					break;
					
			case 2: Methods.viewOrderList();
					break;
					
			case 3: Methods.viewOrderList(null);
					break;		
					
			case 4: Methods.sortOrder();
					break;
			
			case 5: Methods.deleteOrderById();
					break;
					
			case 6: Methods.markAsDelivered();
					break;
					
			case 7: Methods.cancelOrder();
					break;
					
			case 8: Thread t = new Thread(new HomePage());
					t.start();
					
			case 9: try {
				Methods.exit();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
