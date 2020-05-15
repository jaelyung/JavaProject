package store;

public class Order {
	int customerId;
	Menu menu;
	int price;
	//int count ���߿� �߰�
	
	public Order(int customerId, Menu menu, int price) {
		this.customerId=customerId;
		this.menu=menu;
		this.price=price;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [�ֹ���=" + customerId + ", �ֹ��� ����=" + menu.getMenuName() + ", ����=" + price + "]";
	}
	
	
	
	
}
