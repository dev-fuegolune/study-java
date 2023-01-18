package collectionTask;

public class User {
	
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	
	public User() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
}

















