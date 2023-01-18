package classTest;

public class Shop {
	String name;
	int price;
	int stock;
	
	public Shop() {;}

	public Shop(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	int sell(Customer customer) {
		stock--;
		int result = (int)(price * (1.0 - customer.discount / 100.0));
		customer.money -= result;
		return result;
	}
}

















