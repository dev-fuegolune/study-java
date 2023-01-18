package controllStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String title = "색상을 골라주세요!";
		String menu = "1.빨간색\n2.검은색\n3.노란색\n4.흰색";
		String result = null;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(title);
		System.out.println(menu);
		choice = sc.nextInt();

		switch(choice) {
		case 1:
			result = "Red";
			break;
		case 2:
			result = "Black";
			break;
		case 3:
			result = "Yellow";
			break;
		case 4:
			result = "White";
			break;
		default:
			result = "다시 입력해주세요.";
			break;
		}
		
		System.out.println(result);
	}
}


















