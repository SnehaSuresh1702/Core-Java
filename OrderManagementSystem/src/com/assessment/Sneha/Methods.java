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

public class Methods implements OrderManagement {
	
	//Method to Add Order
	public void addOrder() {
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan5 = new Scanner(System.in);
		char userinput;
		
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
				scan.nextLine();
				String OrderDescription = scan.nextLine();
				//String OrderDescription = this.readString();
				System.out.println("Enter the Delivery Address");
				String DeliveryAddress = scan.next();
				System.out.println("Order Date");
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
				double Amount = 0.0;
			outer :	while(true){
				try {
					System.out.println("Enter the Amount");
					Amount = scan.nextDouble();
					if(Amount <= 0.0) {
						System.out.println("Enter a valid amount(Amount cannot be negative)");
						continue outer;
					}
					break outer;
				}catch(Exception e) {
					//Scanner scan1 = new Scanner(System.in);
					System.out.println("Enter a valid amount");
					scan.nextLine();
					continue outer;
					
					//Amount = scan.nextDouble();	
				//}	
				}
				}
				
				System.out.println("Order Status: In Progress");
				LocalDateTime DeliveryDatetime;
				DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDateTime now1 = LocalDateTime.now().plusDays(5);
				System.out.println("Delivery Datetime:" + dtf.format(now1));
				String Status = "In Progress";
				System.out.println("Order Added Successfully");
				
				Order o = new Order(OrderId, OrderDescription, DeliveryAddress, now, Amount, Status, now1);
				OrderList.add(o);
				
				System.out.println("Do you want to enter more order details(Y/N)");
				userinput = scan.next().charAt(0);
				
				if(userinput == 'Y'|| userinput == 'y') {
					System.out.println("Enter another order.");
					//OrderWriter.writeOrders();
				}
				else {
					System.out.println();
					HomePage.display();
			}
				}while(userinput == 'Y' || userinput == 'y');
		}catch(Exception e) {
			System.out.println("Exception Caught.");
		}
	
	}
	
	/*private String readString() {
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}*/
	
	//Method to ViewOrderList
	public void viewOrderList() {
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("OrderId\t\t Order Description\t\t Delivery Address\t\t Order Date\t\t\t\t Amount\t\t\t Delivery Status\t\t\t DeliveryDatetime");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(Order order : OrderList) {
 			
 			System.out.println(order.getOrderId()+"\t\t\t"+order.getOrderDescription()+"\t\t\t"+order.getDeliveryAddress()+"\t\t\t"+order.getOrderDate().format(dtf)+"\t\t\t"+order.getAmount()+"\t\t\t"+order.getStatus()+"\t\t\t"+order.getDeliveryDatetime());
 		
		}
		try {
			//OrderWriter.writeOrders();
			System.out.println();
			HomePage.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
	//Method to ViewOrderList, used MethodOverloading
	public void viewOrderList(String index) {
		boolean flag = false;
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
 				flag = true;
 			}
 		}
		if(flag == false)
			System.out.println("Order Not Found");
		try {
			//OrderWriter.writeOrders();
			System.out.println();
			HomePage.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method to Sort the list based on the property selected
	public void sortOrder(){
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
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		Sort sort = new Sort();
		switch(submenu) {
		
		case 1:
			System.out.println("******** Choose Sort Order *********");
			System.out.println("1. Ascending");
			System.out.println("2. Descending" );
			
			System.out.println("Choose Option:");
			int sortorder = scan.nextInt();
			
			if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderId());
			System.out.println("Successfully Sorted by OrderId in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else if(sortorder == 2){
			Collections.sort(OrderList, sort.new sortByOrderId());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by OrderId in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else
			System.out.println("Invalid Input");
			try {
				System.out.println();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		
		case 2:
			System.out.println("******** Choose Sort Order *********");
			System.out.println("1. Ascending");
			System.out.println("2. Descending" );
			
			System.out.println("Choose Option:");
			sortorder = scan.nextInt();
			
			if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			System.out.println("Successfully Sorted by OrderDescription in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else if(sortorder == 2){
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by OrderDescription in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else
			System.out.println("Invalid Input");
			try {
				System.out.println();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;	
		
		case 3:
			System.out.println("******** Choose Sort Order *********");
			System.out.println("1. Ascending");
			System.out.println("2. Descending" );
			
			System.out.println("Choose Option:");
			sortorder = scan.nextInt();
			
			if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByDeliveryAddress());
			System.out.println("Successfully Sorted by Delivery Address in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else if(sortorder == 2){
			Collections.sort(OrderList, sort.new sortByOrderDescription());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Delivery Address in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else
			System.out.println("Invalid Input");
			try {
				System.out.println();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;	
		
		case 4:
			System.out.println("******** Choose Sort Order *********");
			System.out.println("1. Ascending");
			System.out.println("2. Descending" );
			
			System.out.println("Choose Option:");
			sortorder = scan.nextInt();
			
			if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByOrderDate());
			System.out.println("Successfully Sorted by Order Date in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else if(sortorder == 2){
			Collections.sort(OrderList, sort.new sortByOrderDate());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Order Date in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else
			System.out.println("Invalid Input");
			try {
				System.out.println();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;	
		
		case 5:
			System.out.println("******** Choose Sort Order *********");
			System.out.println("1. Ascending");
			System.out.println("2. Descending" );
			
			System.out.println("Choose Option:");
			sortorder = scan.nextInt();
			
			if(sortorder == 1) {
			Collections.sort(OrderList, sort.new sortByAmount());
			System.out.println("Successfully Sorted by Amount in Ascending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else if(sortorder == 2){
			Collections.sort(OrderList, sort.new sortByAmount());
			Collections.reverse(OrderList);
			System.out.println("Successfully Sorted by Amount in Descending Order");
			for(int i = 0; i<OrderList.size(); i++) {
				System.out.println(OrderList.get(i));
			}
		}
		else
			System.out.println("Invalid Input");
			try {
				System.out.println();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;	
		
	case 6:
		System.out.println("******** Choose Sort Order *********");
		System.out.println("1. Ascending");
		System.out.println("2. Descending" );
		
		System.out.println("Choose Option:");
		sortorder = scan.nextInt();
		
		if(sortorder == 1) {
		Collections.sort(OrderList, sort.new sortByDeliveryDatetime());
		System.out.println("Successfully Sorted by Delivery Datetime in Ascending Order");
		for(int i = 0; i<OrderList.size(); i++) {
			System.out.println(OrderList.get(i));
		}
	}
	else if(sortorder == 2){
		Collections.sort(OrderList, sort.new sortByDeliveryDatetime());
		Collections.reverse(OrderList);
		System.out.println("Successfully Sorted by Delivery Datetime in Descending Order");
		for(int i = 0; i<OrderList.size(); i++) {
			System.out.println(OrderList.get(i));
		}
	}
	else
		System.out.println("Invalid Input");
		try {
			System.out.println();
			HomePage.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;	
	default:
		System.out.println("Invalid Input");
			try {
				//OrderWriter.writeOrders();
				HomePage.display();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	break;	
		}	
	}		
	
	//Method to delete the order from the list based on the OrderId
	public void deleteOrderById() {
		char userinput;
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		Scanner scan = new Scanner(System.in);
		
		try {
		do {
			boolean flag = false;
			System.out.println("Enter Order Id");
			String OrderId = scan.next();
		
			for(Order order : OrderList) {
				if(order.getOrderId().equals(OrderId)) {
					OrderList.remove(order);
					System.out.println("Order Deleted Successfully");
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("OrderId not found");
			}
			
			System.out.println("Do you want to delete another order(Y/N)");
			userinput = scan.next().charAt(0);
			if(userinput == 'Y' || userinput == 'y') {
				System.out.println("Enter another OrderId");
				
				//b = scan.next().charAt(0);
			//	OrderId = scan.next();
				
			}
			else {
				System.out.println();
				HomePage.display();
		}
		}while(userinput == 'Y' || userinput == 'y');
		
	}catch(Exception e) {
		System.out.println("Exception Caught");
		System.out.println("Enter valid data");
		e.printStackTrace();
	}
	}
	
	//Method to cancel an order from the list
	public void cancelOrder() {
		char userinput;
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		
		do {
			boolean flag = false;
			String OrderId = scan.next();
			for(Order order : OrderList) {
	 			
				if(order.getStatus().equals("Cancelled") && order.getOrderId().equals(OrderId)) {
					System.out.println("Order is already cancelled");
					flag = true;
				}
				else if( order.getOrderId().equals(OrderId) && (order.getStatus().equals("In Progress"))) {
					order.setStatus("Cancelled");
					order.setDeliveryDatetime(null);
					System.out.println("Successfully Cancelled");
					flag = true;
				}
				else if(order.getOrderId().equals(OrderId) && (order.getStatus().equals("Delivered"))) {
					System.out.println("The order is Delivered, Cannot be Cancelled");
					flag = true;
				}
	 		}
			if(flag = false)
				System.out.println("Order Not Found");
			System.out.println("Do you want to cancel another order(Y/N)");
			userinput = scan.next().charAt(0);
			if(userinput == 'Y' || userinput == 'y') {
				System.out.println("Enter another OrderId");
			}
		}while(userinput == 'Y' || userinput == 'y');
		try {
			//OrderWriter.writeOrders();
			System.out.println();
			HomePage.display();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	//Method to mark an order as delivered
	public void markAsDelivered() {
		char userinput;
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		
		System.out.println("Enter the OrderId");
		Scanner scan = new Scanner(System.in);
		do {
			boolean flag = false;
			String OrderId = scan.next();
			
			for(Order order : OrderList) {
	 			
				if((order.getStatus().equals("Delivered")) && order.getOrderId().equals(OrderId)) {
					System.out.println("Order is already delivered on " + order.getDeliveryDatetime());
					flag = true;
				}
				else if(order.getOrderId().equals(OrderId) && (order.getStatus().equals("In Progress"))){
					order.setStatus("Delivered");
					order.setDeliveryDatetime(LocalDateTime.now());
					System.out.println("Successfully Delivered");
					flag  = true;
				}
				else if(order.getOrderId().equals(OrderId) && (order.getStatus().equals("Cancelled"))){
					System.out.println("The order is Cancelled, Cannot be Delivered");
					flag = true;
				}
	 		}
			if(flag == false)
				System.out.println("Order Not Found");
			System.out.println("Do you want to mark another Order as Delivered(Y/N)");
			userinput = scan.next().charAt(0);
			if(userinput == 'Y' || userinput == 'y') {
				System.out.println("Enter another OrderId");
			}
		}while(userinput == 'Y' || userinput == 'y');
		try {
			//OrderWriter.writeOrders();
			System.out.println();
			HomePage.display();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Method to generate report
	public void report() throws IOException {
		
		System.out.println("Sub-Menu:");
		System.out.println("*************Choose Report Property*************");
		System.out.println("1. Export All");
		System.out.println("2. By Status");
		System.out.println();
		
		System.out.println("Choose Option:");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		
		OrderReader reader = new OrderReader();
		ArrayList<Order> OrderList = reader.getOrderList();
		String filesuffix = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String filename = "C:\\Users\\Sneha Suresh\\eclipse-workspace\\Report-New"+filesuffix+".txt";
		File file = new File(filename);
		file.createNewFile();
		FileWriter writer = new FileWriter(filename);
		Writer write = new BufferedWriter(writer);
		if(option == 1){
			
				try {	
					for( int i = 0; i < OrderList.size(); i++) {
					writer.write(OrderList.get(i).toString()+"\n");
					}
					writer.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				System.out.println("Report Generated Successfully");
				System.out.println();
				HomePage.display();
		}
		else {
			System.out.println("******** Choose Status *********");
			System.out.println("1. In Progress");
			System.out.println("2. Delivered");
			System.out.println("3. Cancelled");
			System.out.println("Enter the choice");
			int status = scan.nextInt();
		  
			switch(status) {
			case 1:
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
			break;
			case 2:
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
				 break;
			case 3: 
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
				 break;
			default:
				try {
				System.out.println("Invalid input");
				HomePage.display();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		}
		System.out.println("Report Generated Successfully");
		System.out.println();
		HomePage.display();
	}
	
	public void exit() throws IOException {
		
		OrderWriter.writeOrders();
	}
}	



 		
	

	


