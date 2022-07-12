package com.assessment.Sneha;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
	
	OrderReader reader = new OrderReader();
	ArrayList<Order> OrderList = reader.getOrderList();
	
	
	class sortByOrderId implements Comparator<Order>{
		public int compare(Order a, Order b) {
		return a.getOrderId().compareTo(b.getOrderId());
		         
		}
	}
	class sortByOrderDescription implements Comparator<Order>{
		public int compare(Order a, Order b) {
		return a.getOrderDescription().compareToIgnoreCase(b.getOrderDescription());
		
		}
	}
	class sortByDeliveryAddress implements Comparator<Order>{
		public int compare(Order a, Order b) {
		return a.getDeliveryAddress().compareToIgnoreCase(b.getDeliveryAddress());
		
		}
	}
	class sortByOrderDate implements Comparator<Order>{
		public int compare(Order a, Order b) {
		return a.getOrderDate().compareTo(b.getOrderDate());
		
		}
	}
	class sortByAmount implements Comparator<Order>{
		public int compare(Order a, Order b) {
			return (int)(a.getAmount() - (b.getAmount()));
		
		}
	}
	class sortByDeliveryDatetime implements Comparator<Order>{
		public int compare(Order a, Order b) {
		return a.getDeliveryDatetime().compareTo(b.getDeliveryDatetime());
		
		}
	}
}
