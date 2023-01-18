package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	
	
	public static void main(String[] args) {
//		각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
		
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이 페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메세지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예)	회원가입 클릭 시, 회원가입 성공
//			마이 페이지 클릭 시, 본인 이름과 나이 출력
		
//		버튼 배열
		String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
//		성공 메세지 배열
		String[] arMessage = {"회원가입 성공", "로그인 성공", "한동석(20)", "로그아웃 성공"};
//		오류 메세지 배열
		String[] arError = {"회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요"};
//		오류 메세지
		String errorMessage = "다시 시도해주세요";
		
		Scanner sc = new Scanner(System.in);
//		choice : 사용자가 입력한 번호, temp : 사용자가 이전에 입력한 번호
		int choice = 0, temp = 0;
		boolean condition = false;
		
		while(true) {
//			메뉴 출력
			for (int i = 0; i < arButton.length; i++) {
				System.out.println(i + 1 + "." + arButton[i]);
			}
			
//			만약 temp에 0이 담겨있다면, 0을 유지해야 한다.
			temp = temp == 0 ? 0 : choice;
//			사용자가 선택한 버튼 번호
			choice = sc.nextInt();
//			버튼 번호 이외의 번호를 입력했을 경우 오류 메세지 출력
			if(choice < 1 || choice > 4) {System.out.println(errorMessage); continue;}
//			로그아웃 시 프로그램 종료
			if(choice == 4) {System.out.println(arMessage[choice - 1]); break;}
			
//			사용자가 선택한 버튼의 번호 - 1과 이전에 사용자가 입력한 번호가 같은 지 비교
//			전 단계를 진행 했는 지 검사
			condition = choice - 1 == temp;
			
			if(!condition) { // 전 단계를 안했을 경우
				temp = 0; // 회원가입부터 진행하라는 뜻.
				System.out.println(arError[choice - 2]);
				continue;
			}
			// 전 단계를 진행했을 경우
			System.out.println(arMessage[choice - 1]);
			if(choice == 3) { // 마이 페이지를 선택했을 때에는
				temp = 0; // 회원가입부터 진행하라는 뜻.
				continue;
			}
//			마이 페이지 이외의 서비스를 이용했을 경우 입력했던 번호를 temp에 저장한다.
			temp = choice;
			
		}
	}
}
















