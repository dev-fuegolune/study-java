package arrayListTask;

public class Love {
	private int number;
	private String name;
	private int age;
	
	public Love() {;}
	
	public Love(int number, String name, int age) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Love [number=" + number + ", name=" + name + ", age=" + age + "]";
	}
}
