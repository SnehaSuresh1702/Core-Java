package com.assessment.Sneha;


import java.io.IOException;

public interface OrderManagement {

	void addOrder();
	void viewOrderList() throws IOException;
	void viewOrderList(String index) throws IOException;
	void sortOrder() throws IOException;
	void deleteOrderById() throws IOException;
	void cancelOrder() throws IOException;
	void markAsDelivered() throws IOException;
	void report() throws IOException;
	void exit() throws IOException;
	
}
