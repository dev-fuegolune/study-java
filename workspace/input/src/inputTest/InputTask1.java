package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용한다.
		
		int num1 = 0, num2 = 0, result = 0;
		String num1Msg = "첫번째 정수 : ", num2Msg = "두번째 정수 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(num1Msg);
		num1 = Integer.parseInt(sc.next());
		
		System.out.print(num2Msg);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, result);
		
	}
}















