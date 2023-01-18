package lambdaTask;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class MyMath {
	public static Calc calculator(String oper) {
		Calc calc = null;
		switch(oper) {
		case "+":
			calc = (n1, n2) -> n1 + n2;
			break;
		case "-":
			calc = (n1, n2) -> n1 - n2;
			break;
		}
		return calc;
	}
	
	public static void main(String[] args) {
		OperCheck operCheck = e -> {
			String temp = "";
			for (int i = 0; i < e.length(); i++) {
				char c = e.charAt(i);
				if(c == '-' || c == '+') {
					temp += c;
				}
			}
			return temp.split("");
		};
		
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		String[] opers = null, numbers = null;
		
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine();
		expression = expression.trim(); // 앞 뒤 공백 제거
		expression = expression.replaceAll(" ", ""); // 사이 공백 제거
		
		opers = operCheck.getOpers(expression);
		numbers = expression.split("\\+|\\-");
		
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1= MyMath.calculator(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}


















