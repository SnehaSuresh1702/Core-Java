package com.assessment.Sneha;   

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;

public class Methods {
	
	public static void addOrder() {
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		Scanner scan = new Scanner(System.in);
		char a;
		
		try {
			do {
				boolean flag = false;
				System.out.println("Enter the Order Id");
				String OrderId = scan.next();
				do {
					for(Order order : OrderList) {
					if(order.getOrderId().equals((OrderId))) {
						System.out.println("Duplicate Order Id. Please enter unique order id");
						System.out.println("Enter a new Order Id");
						OrderId = scan.next();
					}
				}
				}while(flag == true);
				System.out.println("Enter the Order Description");
				String OrderDescription = scan.next();
				System.out.println("Enter the Delivery Address");
				String DeliveryAddress = scan.next();
				System.out.println("Order Date");
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH : mm : ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
				System.out.println("Enter the Amount");
				double Amount = scan.nextDouble();
				System.out.println("Order Status: In Progress");
				LocalDateTime DeliveryDatetime;
				DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH : mm : ss");
				LocalDateTime now1 = LocalDateTime.now().plusDays(5);
				System.out.println("Delivery Datetime:" + dtf.format(now1));
				String Status = "In Progress";
				System.out.println("Order Added Successfully");
				
				Order o = new Order(OrderId, OrderDescription, DeliveryAddress, now, Amount, Status, now1);
				OrderList.add(o);
				
				System.out.println("Do you want to enter more order details(Y/N)");
				a = scan.next().charAt(0);
				
				if(a == 'Y'|| a== 'y') {
					System.out.println("Enter another order.");
				}
				else
					HomePage.display();
		
				}while(a == 'Y' || a== 'y');
		}catch(Exception e) {
			System.out.println("Exception Caught");
		}
	}
	
	public static void viewOrderList() throws IOException {
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();

		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("OrderId\t\t Order Description\t\t Delivery Address\t\t Order Date\t\t\t\t Amount\t\t\t Delivery Status\t\t\t DeliveryDatetime");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(Order order : OrderList) {
 			
 			System.out.println(order.getOrderId()+"\t\t\t"+order.getOrderDescription()+"\t\t\t"+order.getDeliveryAddress()+"\t\t\t"+order.getOrderDate()+"\t\t\t"+order.getAmount()+"\t\t\t"+order.getStatus()+"\t\t\t"+order.getDeliveryDatetime());
 		
		}
		HomePage.display();
 	}
 	
	public static void viewOrderList(String index) throws IOException {
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		String OrderId = scan.next();
			
		for(Order order : OrderList) {
 			
			if(order.getOrderId().equals((OrderId))){
 				System.out.println("Order Detail:");
 				System.out.println("OrderId: " + order.getOrderId());
 				System.out.println("Order Description: " + order.getOrderDescription());
 				System.out.println("Delivery Address: " + order.getDeliveryAddress());
 				System.out.println("Order Date: " + order.getOrderDate());
 				System.out.println("Amount: " + order.getAmount());
 				System.out.println("Delivery Datetime: " + order.getDeliveryDatetime());
 			}
 		}		
		HomePage.display();
	}
	
	public static void sortOrder() throws IOException{
		System.out.println("Sub-Menu:");
		System.out.println("*************Choose Sort Order Property*************");
		System.out.println("1. OrderId");
		System.out.println("2. OrderDescription");
		System.out.println("3. DeliveryAddress");
		System.out.println("4. Order Date");
		System.out.println("5. Amount");
		System.out.println("6. Delivery Datetime");
		System.out.println("7. Exit");
		System.out.println();
		
		System.out.println("Choose Option:");
		Scanner scan = new Scanner(System.in);
		int submenu = scan.nextInt();
		
		System.out.println("******** Choose Sort Order *********");
		System.out.println("1. Ascending");
		System.out.println("2. Descending" );
		
		System.out.println("Choose Option:");
		int sortorder = scan.nextInt();
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		Sort sort = new Sort();
		switch(submenu) {
		case 1:if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderId());
			System.out.println("Successfully Sorted by OrderId in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else {
			Collections.sort(OrderList, sort.new sortByOrderId());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by OrderId in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		HomePage.display();
		break;
		
		case 2:if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			System.out.println("Successfully Sorted by OrderDescription in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else {
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by OrderDescription in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		HomePage.display();
		break;	
		
		case 3:if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByDeliveryAddress());
			System.out.println("Successfully Sorted by Delivery Address in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else {
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Delivery Address in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		HomePage.display();
		break;	
		
		case 4:if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderDate());
			System.out.println("Successfully Sorted by Order Date in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else {
			Collections.sort(OrderList, sort.new sortByOrderDate());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Order Date in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		HomePage.display();
		break;	
		
		case 5:if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByAmount());
			System.out.println("Successfully Sorted by Amount in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else {
			Collections.sort(OrderList, sort.new sortByAmount());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Amount in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		HomePage.display();
		break;	
		
	case 6:if(sortorder == 1) {
		Collections.sort(OrderList, sort.new sortByDeliveryDatetime());
		System.out.println("Successfully Sorted by Delivery Datetime in Ascending Order");
		for(int i = 0; i<OrderList.size(); i++) {
			System.out.println(OrderList.get(i));
		}
	}
	else {
		Collections.sort(OrderList, sort.new sortByDeliveryDatetime());
		Collections.reverse(OrderList);
		System.out.println("Successfully Sorted by Delivery Datetime in Descending Order");
		for(int i = 0; i<OrderList.size(); i++) {
			System.out.println(OrderList.get(i));
		}
	}
	HomePage.display();
	break;	
		}	
	}		
	
	public static void deleteOrderById() {
		char b;
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		String OrderId = scan.next();
		try {
		do {
			
			for(Order order : OrderList) {
	 			
				if(order.getOrderId().equals((OrderId))){
					
					OrderList.remove(order);
					System.out.println("Order deleted Successfully.");
					OrderWriter.writeOrders();
					break;
	 			}else {
	 				System.out.println("Order Id is not available");
	 				break;
	 			}
	 		}
			System.out.println("Do you want to enter more order details(Y/N)");
			b = scan.next().charAt(0);
			
			if(b == 'Y'|| b == 'y') {
				System.out.println("Enter another Order Id.");
				OrderWriter.writeOrders();
			}
			else
				HomePage.display();
	
			}while(b == 'Y' || b == 'y');
	}catch(Exception e) {
		System.out.println("Exception Caught");
		e.printStackTrace();
	}
	}
	
	public static void cancelOrder() throws IOException {
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		String OrderId = scan.next();
			
		for(Order order : OrderList) {
 			
			if(order.getStatus().equals("Cancelled") && order.getOrderId().equals(OrderId)) {
				System.out.println("Order is already cancelled");
			}
			else if( order.getOrderId().equals(OrderId)) {
				order.setStatus("Cancelled");
				order.setDeliveryDatetime(null);
				System.out.println("Successfully Cancelled");
			}
 		}
		HomePage.display();
	}	
	
	public static void markAsDelivered() throws IOException {
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		String OrderId = scan.next();
			
		for(Order order : OrderList) {
 			
			if((order.getStatus().equals("Delivered")) && order.getOrderId().equals(OrderId)) {
				System.out.println("Order is already delivered on " + order.getDeliveryDatetime());
			}
			else if(order.getOrderId().equals(OrderId)){
				order.setStatus("Delivered");
				order.setDeliveryDatetime(LocalDateTime.now());
				System.out.println("Successfully Delivered");
				//OrderWriter.writeOrders();
			}
 		}
		HomePage.display();
	}
	
	public static void report() throws IOException {
		
		System.out.println("Sub-Menu:");
		System.out.println("*************Choose Report Property*************");
		System.out.println("1. Export All");
		System.out.println("2. By Status");
		System.out.println();
		
		System.out.println("Choose Option:");
		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		String filesuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String filename = "C:\\Users\\Sneha Suresh\\eclipse-workspace\\Report-New"+filesuffix+".txt";
		File file = new File(filename);
		file.createNewFile();
		FileWriter writer = new FileWriter(filename);
		Writer write = new BufferedWriter(writer);
		if(j == 1){
			
				try {	
					for( int i = 0; i < OrderList.size(); i++) {
					writer.write(OrderList.get(i).toString()+"\n");
					}
					writer.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
		else {	
			System.out.println("******** Choose Status *********");
			System.out.println("1. In Progress");
			System.out.println("2. Delivered");
			System.out.println("3. Cancelled");
			int status = scan.nextInt();
		  
			if(status == 1) {
			 try {	
				for(Order order : OrderList) {
				if((order.getStatus().equals("In Progress"))){	
					writer.write(order+"\n");
				}
				}
				writer.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			else if(status == 2) {
				 try {	
					for(Order order : OrderList) {
					if((order.getStatus().equals("Delivered"))){	
						writer.write(order+"\n");
					}
					}
					writer.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			else {
				 try {	
					for(Order order : OrderList) {
					if((order.getStatus().equals("Cancelled"))){	
						writer.write(order+"\n");
					}
					}
					writer.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}	
		System.out.println("Report Generated Successfully");
		HomePage.display();
	}
	
	public static void exit() throws IOException {
		
		OrderWriter.writeOrders();
	}
}	



 		
	

	


