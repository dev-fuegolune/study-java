package arrayListTask;

public class Fruit {
	private String name;
	private int price;
	
	public Fruit() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
}
