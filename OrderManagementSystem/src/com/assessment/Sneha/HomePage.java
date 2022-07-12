package com.assessment.Sneha;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HomePage implements Runnable {
public void run() {
		try {
		Methods reports = new Methods();
		reports.report();

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
			case 1: 
				Methods add = new Methods();
				add.addOrder();
					break;
					
			case 2: 
				Methods view = new Methods();
			    view.viewOrderList();
					break;
					
			case 3: 
				Methods viewID = new Methods();
				viewID.viewOrderList(null);
					break;		
					
			case 4: 
				Methods sort = new Methods();
				sort.sortOrder();
					break;
			
			case 5: 
				Methods delete = new Methods();
				delete.deleteOrderById();
					break;
					
			case 6: 
				Methods mark = new Methods();
				mark.markAsDelivered();
					break;
					
			case 7: 
				Methods cancel = new Methods();
				cancel.cancelOrder();
					break;
					
			case 8: Thread t = new Thread(new HomePage());
					t.run();
					break;
				
			case 9: try {
				Methods exit = new Methods();
				exit.exit();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			default:
				System.out.println("Invalid Input");
				HomePage.display();
		}
	}
}
