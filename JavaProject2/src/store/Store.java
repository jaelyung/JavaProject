package store;

import java.util.ArrayList;

public class Store {
	private static Store instance= new Store();
	private static String STORE_NAME="GoodStore";
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private ArrayList<Menu> menuList = new ArrayList<Menu>();
	
	private Store() {}
	
	public static Store getInstance() {
		if(instance==null) {
			instance=Store.getInstance();
		}
		return instance;
	}

	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public void addMenu(Menu menu) {
		menuList.add(menu);
	}
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public ArrayList<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(ArrayList<Menu> menuList) {
		this.menuList = menuList;
	}
	
	
}
