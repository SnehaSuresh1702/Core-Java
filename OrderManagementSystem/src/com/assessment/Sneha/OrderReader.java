package com.assessment.Sneha;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OrderReader {
	private static ArrayList<Order> OrderList = new ArrayList<Order>();
	
	public  ArrayList<Order> getOrderList() {
		return OrderReader.OrderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		OrderReader.OrderList = orderList;
	}

	public static void readOrders() throws IOException{
		File file = new File("C:\\Users\\Sneha Suresh\\eclipse-workspace\\OrderManagement.txt"); //file to be read
		Scanner readfile = new Scanner(file);
		StringTokenizer token = null; //
		
		String OrderId = "";
	 	String OrderDescription = "";
		String DeliveryAddress = "";
	 	LocalDateTime OrderDate;
	 	double Amount = 0.0;
	 	String Status = "";
	 	LocalDateTime DeliveryDatetime;
	 	
	 	while(readfile.hasNextLine()) {
	 		token = new StringTokenizer(readfile.nextLine(),"\t");
	 		OrderId = token.nextToken();
	 		OrderDescription = token.nextToken();
	 		DeliveryAddress = token.nextToken();
	 		OrderDate = LocalDateTime.parse(token.nextToken(),DateTimeFormatter.ISO_DATE_TIME);
	 		Amount = Double.parseDouble(token.nextToken());
	 		Status = token.nextToken();
	 		DeliveryDatetime = LocalDateTime.now().plusDays(5);
	 		
	 		Order order = new Order(OrderId, OrderDescription, DeliveryAddress, OrderDate, Amount, Status, DeliveryDatetime);
	 		
	 		OrderList.add(order);
	 		
	 	}
	}
}
