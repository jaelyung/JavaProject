package test;

import store.Customer;
import store.Menu;
import store.Order;
import store.Store;
import store.report.GenerateOrderReport;
import utils.Define;

public class TestMain {
	Store goodStore = Store.getInstance();
	Menu blackTiger;
	Menu realCheese;
	Menu salad;
	
	GenerateOrderReport orderReport = new GenerateOrderReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createMenu();
		test.createCustomer();
		
		String report = test.orderReport.getReport();
		System.out.println(report);
		
		
	}

	public void createCustomer() {
		Customer customer1 = new Customer(181213, "안성원", "010-1234-1234");
		Customer customer2 = new Customer(181518, "오태훈", "010-2345-2345");
		Customer customer3 = new Customer(171230, "이동호", "010-3456-3456");
		Customer customer4 = new Customer(171255, "조성욱", "010-4567-4567");
		Customer customer5 = new Customer(171590, "최태평", "010-1245-1245");
		
		goodStore.addCustomer(customer1);
		goodStore.addCustomer(customer2);
		goodStore.addCustomer(customer3);
		goodStore.addCustomer(customer4);
		goodStore.addCustomer(customer5);
		
		blackTiger.register(customer1);
		blackTiger.register(customer2);
		blackTiger.register(customer3);
		blackTiger.register(customer4);
		blackTiger.register(customer5);
		
		realCheese.register(customer1);
		realCheese.register(customer2);
		realCheese.register(customer3);
		realCheese.register(customer4);
		realCheese.register(customer5);
		
		salad.register(customer1);
		salad.register(customer2);
		salad.register(customer3);
		salad.register(customer4);
		salad.register(customer5);
		
		addPriceForCustomer(customer1, blackTiger, 29000);
		addPriceForCustomer(customer1, realCheese, 21000);
		addPriceForCustomer(customer1, salad, 8000);
		
		addPriceForCustomer(customer2, blackTiger, 29000);
		addPriceForCustomer(customer2, realCheese, 21000);
		addPriceForCustomer(customer2, salad, 8000);
		
		addPriceForCustomer(customer3, blackTiger, 29000);
		addPriceForCustomer(customer3, realCheese, 21000);
		addPriceForCustomer(customer3, salad, 8000);
		
		addPriceForCustomer(customer4, blackTiger, 29000);
		addPriceForCustomer(customer4, realCheese, 21000);
		addPriceForCustomer(customer4, salad, 8000);
		
		addPriceForCustomer(customer5, blackTiger, 29000);
		addPriceForCustomer(customer5, realCheese, 21000);
		addPriceForCustomer(customer5, salad, 8000);
		
	}

	public void addPriceForCustomer(Customer customer, Menu menu, int price) {
		Order order = new Order(customer.getCustomerId(), menu, price);
		customer.addMenuOrder(order);
		
	}

	public void createMenu() {//가격을 Menu생성자에서 생략할 것인지 addPriceForCustomer 메소드에서 생략할 것인지?
		//가격의 총 합계는 어떻게 보여줄 것인지?
		//메뉴마다 아이디가 꼭 필요한지?
		blackTiger = new Menu("블랙타이거", Define.PIZZA, 29000);
		realCheese = new Menu("리얼치즈", Define.PIZZA, 21000);
		salad = new Menu("샐러드", Define.SIDE, 8000);
		
		blackTiger.setPriceType(Define.PREMIUM);
		salad.setPriceType(Define.SIDEDISH);
		
		goodStore.addMenu(blackTiger);
		goodStore.addMenu(realCheese);
		goodStore.addMenu(salad);
	}

	
}
