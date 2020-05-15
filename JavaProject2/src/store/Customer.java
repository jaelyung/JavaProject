package store;

import java.util.ArrayList;

public class Customer {

	private int customerId;
	private String customerName;
	private ArrayList<Order> orderList = new ArrayList<Order>();
	private String customerContact;
	
	public Customer(int customerId, String customerName, String customerContact) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}
	public void addMenuOrder(Order order) {
		orderList.add(order);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public String getCustomercontact() {
		return customerContact;
	}
	public void setCustomercontact(String customercontact) {
		this.customerContact = customercontact;
	}
	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}
	
	
	
	
}
