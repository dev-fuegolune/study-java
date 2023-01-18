package inheritanceTest;

class A {
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모 생성자 호출");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b);
		b.name = "B";
		b.printName();
		b.printData();
	}
}












