package inheritanceTest;

class Human {
	void eat() {
		System.out.println("¸Ô±â");
	}
	
	void sleep() {
		System.out.println("ÀáÀÚ±â");
	}
	
	void walk() {
		System.out.println("µÎ ¹ß·Î °È±â");
	}
}

class Monkey extends Human{
	void shakeTail() {
		System.out.println("²¿¸® Ä¡±â");
	}
	
	@Override
	void walk() {
		super.walk();
		System.out.println("³× ¹ß·Î °È±â");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}


















