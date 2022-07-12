package com.assessment.Sneha;

import java.time.LocalDateTime;

 class Order {
 	
 	public LocalDateTime getOrderDate() {
		return OrderDate;
	}

	public LocalDateTime getDeliveryDatetime() {
		return DeliveryDatetime;
	}
	private String OrderId;
	private String OrderDescription;
	private String DeliveryAddress;
 	private LocalDateTime OrderDate;
 	private double Amount;
 	private String Status;
 	private LocalDateTime DeliveryDatetime;
 	
 	@Override
	public String toString() {
		return OrderId + "\t"  + OrderDescription + "\t\t\t" + DeliveryAddress + "\t\t" + OrderDate + "\t" + Amount + "\t" + Status + "\t" + DeliveryDatetime;
	}
 	
	public String getOrderId() {
		return OrderId;
	}

	public String getStatus() {
		return Status;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.OrderDate = orderDate;
	}

	public void setDeliveryDatetime(LocalDateTime deliveryDatetime) {
		this.DeliveryDatetime = deliveryDatetime;
	}
	
	public void setStatus(String status) {
		this.Status = status;
	}

	public void setOrderId(String orderId) {
		this.OrderId = orderId;
	}

	public String getOrderDescription() {
		return OrderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.OrderDescription = orderDescription;
	}

	public String getDeliveryAddress() {
		return DeliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.DeliveryAddress = deliveryAddress;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		this.Amount = amount;
	}

	public Order(String orderId, String orderDescription, String deliveryAddress, LocalDateTime orderDate,
			double amount, String status, LocalDateTime deliveryDatetime) {
		super();
		OrderId = orderId;
		OrderDescription = orderDescription;
		DeliveryAddress = deliveryAddress;
		OrderDate = orderDate;
		Amount = amount;
		Status = status;
		DeliveryDatetime = deliveryDatetime;
		
	}
}
