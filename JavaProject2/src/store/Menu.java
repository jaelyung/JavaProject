package store;

import java.util.ArrayList;

import utils.Define;

public class Menu {
	private String menuName;
	private int menuId;
	private int price;
	private int priceType;
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public Menu(String menuName, int menuId,int price) {
		this.menuName = menuName;
		this.menuId = menuId;
		this.price = price;
		this.priceType = Define.CLASSIC;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getPriceType() {
		return priceType;
	}

	public void setPriceType(int priceType) {
		this.priceType = priceType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public void register(Customer customer) {
		customerList.add(customer);
	}
	
}
