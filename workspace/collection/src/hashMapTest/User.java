package hashMapTest;

public class User {
	private int number;
	private String id;
	private String password;
	private String name;
	private int age;
	
	public User() {;}

	public User(int number, String id, String password, String name, int age) {
		super();
		this.number = number;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "User [number=" + number + ", id=" + id + ", password=" + password + ", name=" + name + ", age=" + age
				+ "]";
	}
	
}
