package arrayListTask;

public class Food {
	private String name;
	private int price;
	private String kind;
	
	public Food() {;}

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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", kind=" + kind + "]";
	}
}
