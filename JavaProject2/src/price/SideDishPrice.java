package price;

public class SideDishPrice implements StandardPrice {

	@Override
	public double getPrice(int price) {
		return price;
	}

}
