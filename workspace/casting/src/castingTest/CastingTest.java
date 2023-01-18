package castingTest;

class Car {
	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
}

class SuperCar extends Car{
	@Override
	void engineStart() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
	}
	
	void openRoof() {
		System.out.println("ÁöºØ ¿­±â");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
//		up casting
		Car noOptionFerrari = new SuperCar();
//		SuperCar brokenFerrari = (SuperCar)new Car();
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
//		matiz instanceof Car : true
		System.out.println(matiz instanceof Car);
		
//		matiz instanceof SuperCar : false
		System.out.println(matiz instanceof SuperCar);
		
//		ferrari instanceof Car : true
		System.out.println(ferrari instanceof Car);
		
//		ferrari instanceof SuperCar : true
		System.out.println(ferrari instanceof SuperCar);
		
//		noOptionFerrari instanceof Car : true
		System.out.println(noOptionFerrari instanceof Car);
		
//		noOptionFerrari instanceof SuperCar : true
		System.out.println(noOptionFerrari instanceof SuperCar);
		
//		fullOptionFerrari instanceof Car : true
		System.out.println(fullOptionFerrari instanceof Car);
		
//		fullOptionFerrari instanceof SuperCar : true
		System.out.println(fullOptionFerrari instanceof SuperCar);
	}
}
















