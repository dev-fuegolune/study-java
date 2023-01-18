package classTest;

import java.util.Scanner;

public class ClassArray {
	public static void main(String[] args) {
		Shop shop = new Shop("과자", 3000, 10);
		Customer[] customers = {
				new Customer("Tom", "01012341234", 50000, 10),
				new Customer("Jack", "01055556666", 100000, 50)
		};
		Scanner sc = new Scanner(System.in);
		int choice = 0, result = 0;
		
//		for (int i = 0; i < customers.length; i++) {
//			customers[i] = new Customer();
//		}
		
		System.out.println("어떤 손님으로 진행하시겠어요?");
		System.out.println("1. Tom");
		System.out.println("2. Jack");
		choice = sc.nextInt();
		result = shop.sell(customers[choice - 1]);
		System.out.println("구매 내역");
		System.out.println("상품명: " + shop.name);
		System.out.println("상품가격: " + shop.price);
		System.out.println("할인율: " + customers[choice - 1].discount);
		System.out.println("최종 결제 금액: " + result);
	}
}

















