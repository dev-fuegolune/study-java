package classTest;

import java.util.Scanner;

class SuperCar {
//	브랜드, 색상 가격
	String brand;
	String color;
	String password;
	int price;
	
//	비밀번호 오류 횟수
	int wrongCount; 
//	엔진 상태
	boolean check;

	{
//		자동차 출고 시 초기 비밀번호 세팅
		password = "0000";
	}
	
//	생성자
	public SuperCar() {}
	
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	원하는 비밀번호로 세팅 가능
	public SuperCar(String brand, String color, int price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}

//	시동 켜기
//	엔진 상태를 확인하고
//	시동이 꺼져있다면, "시동 켜짐" 출력
//	이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
	void engineStart() {
		check = true;
	}
	
//	시동 끄기
//	엔진 상태를 확인하고
//	시동이 켜져있다면, "시동 꺼짐" 출력
//	이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력
	void engineStop() {
		check = false;
	}
	
//	시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
//	3번 연속 잘못 입력했을 시 "경찰 출동" 출력
//	※ 문자열 비교는 ==이 아닌 equals()로 비교한다.
//	  "문자열".equals("문자열");
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		String message = "1.시동켜기\n2.시동끄기";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		SuperCar urus = new SuperCar("Lamborghini", "Yellow", 35000, "1234");
		
//		원하는 부분에 표시를 할 수 있는 변수를 FLAG라고 한다.
		boolean flag = false;
		
		while(true) {
			System.out.println(message);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
//				시동이 꺼져있을 때
				if(!urus.check) {
//					비밀번호 입력 후 검사
					System.out.print("비밀번호: ");
					if(urus.checkPassword(sc.next())) {
//						비밀번호 정상 입력 시 시동 켜기
						urus.engineStart();
						System.out.println(urus.brand + " 시동 켜짐");
//						비밀번호 오류 횟수 초기화
						urus.wrongCount = 0;
					}else { // 비밀번호 오류 시
//						비밀번호 오류 횟수 증가
						urus.wrongCount++;
						if(urus.wrongCount > 2) { // 3회 이상 오류 시
							System.out.println("경찰 출동");
//							나갈 준비
							flag = true;
						}
						System.out.println("비밀번호 " + urus.wrongCount + "회 오류");
					}
					break;
				}
				System.out.println("이미 시동이 켜져있습니다.");
				break;
			case 2:
//				시동이 켜져 있을 때
				if(urus.check) {
//					시동 끄기
					urus.engineStop();
					System.out.println(urus.brand + " 시동 꺼짐");
//					나갈 준비
					flag = true;
					break;
				}
				System.out.println("이미 시동이 꺼져있습니다.");
				break;
			default:
				break;
			}
			
//			flag가 true일 때에는 while문 탈출
			if(flag) {
				break;
			}
		}
	}
}


























