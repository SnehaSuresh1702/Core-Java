package com.assessment.Sneha;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class OrderWriter {
	
	public static void writeOrders() throws IOException {
	OrderReader reader = new OrderReader();
	ArrayList<Order> OrderList = reader.getOrderList();
	FileWriter writer = new FileWriter("C:\\Users\\Sneha Suresh\\eclipse-workspace\\OrderManagement.txt");
	Writer write = new BufferedWriter(writer);
	
		try {	
			for( int i = 0; i < OrderList.size(); i++) {
			writer.write(OrderList.get(i).toString()+"\n");
			}
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
