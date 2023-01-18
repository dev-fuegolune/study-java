package classTest;

class Car{
//	브랜드
//	색상
//	가격
	String brand;
	String color;
	int price;
	
	Car(String brand, String color, int price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}

//	시동켜기(브랜드 시동 켜기)
	void engineStart() {
		System.out.println(this.brand + " 시동 켜기");
	}
	
//	시동끄기(브랜드 시동 끄기)
	void engineStop() {
		System.out.println(this.brand + " 시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("KIA", "Black", 3000);
		Car momCar = new Car("BENZ", "White", 10000);
		Car dadyCar = new Car("Red", 6000);
//		myCar.brand = "KIA";
//		myCar.color = "Black";
//		myCar.price = 3000;
		
		myCar.engineStart();
		myCar.engineStop();
		
		momCar.engineStart();
		momCar.engineStop();
	}
}
















