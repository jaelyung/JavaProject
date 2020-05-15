package store.report;

import java.util.ArrayList;

import price.ClassicPrice;
import price.PremiumPrice;
import price.SideDishPrice;
import price.StandardPrice;
import store.Customer;
import store.Menu;
import store.Order;
import store.Store;
import utils.Define;

public class GenerateOrderReport {

	Store store = Store.getInstance();
	public static final String TITLE = " 주문 리스트 \t\t\n";
	public static final String HEADER = " 이름  |  아이디     |  연락처                    | 결제금액  \n";
	public static final String LINE = "--------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Menu> menuList = store.getMenuList(); //모든 메뉴에 대한 리스트 산출
		for(Menu menu : menuList) {
			makeHeader(menu);
			makeBody(menu);
			makeFooter();			
		}
		return buffer.toString();
	}
	
	public void makeHeader(Menu menu) {
		buffer.append(GenerateOrderReport.LINE);
		buffer.append("\t" + menu.getMenuName());
		buffer.append(GenerateOrderReport.TITLE);
		buffer.append(GenerateOrderReport.HEADER);
		buffer.append(GenerateOrderReport.LINE);		
	}
	
	public void makeBody(Menu menu) {

		ArrayList<Customer> customerList = menu.getCustomerList();
		
		for(int i=0; i<customerList.size(); i++) {
			Customer customer= customerList.get(i);
			buffer.append(customer.getCustomerName());
			buffer.append(" | ");
			buffer.append(customer.getCustomerId());
			buffer.append(" | ");
			buffer.append(customer.getCustomercontact());
			
			getTotalPrice(customer, menu);
			buffer.append("\n");
			buffer.append(LINE);
		}
		
	}
	
	public void getTotalPrice(Customer customer, Menu menu) {
		ArrayList<Order> orderList = customer.getOrderList();
		
		StandardPrice[] standardPrice = { new PremiumPrice(), new ClassicPrice(), new SideDishPrice()};
		
		for(int i=0; i<orderList.size(); i++) {
			
			Order order = orderList.get(i);
			if(order.getMenu().getMenuId() == menu.getMenuId()) {
				double price=0;
				if(menu.getPriceType() == Define.PIZZA) {
					if(menu.getPriceType()==Define.PREMIUM) {
						price = standardPrice[Define.PREMIUM].getPrice(order.getPrice());
					}else if(menu.getPriceType() == Define.CLASSIC) {
						price = standardPrice[Define.CLASSIC].getPrice(order.getPrice());
					}
				}else if(menu.getPriceType() == Define.SIDE) {
					price = standardPrice[Define.SIDEDISH].getPrice(order.getPrice());
				}
				buffer.append(" | ");
				buffer.append((int)price);
				break;
			}			
		}
	}

	public void makeFooter() {
		buffer.append("\n");
	}
	
}
