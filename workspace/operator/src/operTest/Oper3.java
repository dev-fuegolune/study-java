package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예)	183 -> 183 출력
//			183.5 -> 183.5 출력
//		삼항 연산자를 사용!
		
//		힌트!
//		뺄셈으로 풀면 쉬움
//		서식문자로 풀면 더 쉬움
		double height = 0.0;
		String message = "키: ";
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		String format = null;
		String forLength = "";
		int length = 0;
		
		System.out.print(message);
		height = sc.nextDouble();
		check = height - (int)height == 0;
		forLength = height - (int)height + "";
		
		length = forLength.length() > 8 ? 8 : forLength.length();
		
		format = check ? "%.0fcm" : "%." + (length - 2) + "fcm";
		System.out.printf(format, height); 
	}
}

















