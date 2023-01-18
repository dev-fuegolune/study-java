package controllStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 대소비교
		int firstNumber = 0, lastNumber = 0;
		String message = "정수 두 개를 입력하세요", result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		if(firstNumber > lastNumber) {
			result = "큰 값: " + firstNumber;
			
		}else if(firstNumber != lastNumber) {
			result = "큰 값: " + lastNumber;
			
		}else {
			result = "두 수가 같습니다.";
			
		}
		System.out.println(result);
	}
}

















