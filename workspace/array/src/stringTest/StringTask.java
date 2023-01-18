package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		String message = "문구 입력 : ";
//		null로 초기화 했다면, 대입 연산자를 사용하겠다는 뜻.
//		""로 초기화 했다면, 누적 연산자를 사용하겠다는 뜻.
//		String string = null, result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(message);
//		string = sc.nextLine();
//		
////		사용자가 입력한 문자열 길이만큼 반복하여
//		for (int i = 0; i < string.length(); i++) {
////			각 문자를 c에 담는다.
//			char c = string.charAt(i);
////			각 문자가 대문자일 경우
//			if(c >= 65 && c <= 90) {
////				소문자로 변경하여 result에 대입한다.
//				result += (char)(c + 32);
//			}else if(c >= 97 && c <= 122){
////				소문자일 경우
////				대문자로 변경하여 result에 대입한다.
//				result += (char)(c - 32);
//			}else {
////				알파벳이 아니면 그대로 result에 대입한다.
//				result += c;
//			}
//		}
//		
//		System.out.println(result);
		
			
//		정수를 한글로 변경
//		예) 1024 -> 일공이사
		String message = "정수 : ", result = "";
		String hangle = "공일이삼사오육칠팔구";
		Scanner sc = new Scanner(System.in);
		String data = null;
		
		System.out.print(message);
		data = sc.next();
		
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		
		System.out.println(result);
		
		
		
//		int number = 0;
//		
//		System.out.print(message);
//		number = sc.nextInt();
//		
//		while(number != 0) { // 계속 나누어서 몫이 0이 될 때까지 반복
//			result = hangle.charAt(number % 10) + result;
//			number /= 10;
//		}
//		System.out.println(result);
	}
}

























