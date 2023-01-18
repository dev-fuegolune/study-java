package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후
//		세 정수의 곱셈 출력
//		next()만 사용.
		String message = "세 정수를 입력하세요\n예)1 2 3";
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		String format = "%d * %d * %d = %d";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
		result = num1 * num2 * num3;
		
		System.out.printf(format, num1, num2, num3, result);
	}
}













