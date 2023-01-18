package bank;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		Bank[] arBank = null;
		
		final int ACCOUNT_LENGTH = 6;
		
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
//		계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기
		String menu = "0. 주식시장\n1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 다시 선택";
		Scanner sc = new Scanner(System.in);
		int index = 0, choice = 0, money = 0;
		String account = "", phoneNumber = null, password = null;
		Random random = new Random();
		Bank user = null, userCheck = null;
		
		
		while(true) {
//			은행을 선택한다.
			System.out.println(message);
			index = sc.nextInt();
			if(index == 4) {break;} // 나가기 눌렀을 때에는 while문 즉시 탈출!
			index--; // 인덱스로 쓸 거라서 1을 빼준다.
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				if(choice == 6) {break;}
				
				if(choice == 1) { // 계좌 개설
					arBank = new Bank[] {new Shinhan(), new Kookmin(), new KaKao()};
					
					while(true) {
						for (int i = 0; i < ACCOUNT_LENGTH; i++) {
							account += random.nextInt(10);
						}
						userCheck = Bank.checkAccount(arrBank, arCount, account);
						if(userCheck == null) {break;}
					}
					user = arBank[index];
					account = index + account;
					user.setAccount(account);
					account = "";
					
					System.out.print("예금주: ");
					user.setName(sc.next());
					
					while(true) {
						System.out.print("핸드폰 번호['-' 제외]: ");
						phoneNumber = sc.next();
						
						phoneNumber = phoneNumber.replaceAll("-", "");
						if(phoneNumber.length() == 11) {
							if(phoneNumber.startsWith("010")) {
								userCheck = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
								if(userCheck == null) {
									break;
								}
							}
						}
						System.out.println("잘못된 핸드폰 번호입니다.");
					}
					user.setPhoneNumber(phoneNumber);
					
					while(true) {
						System.out.print("비밀번호[4자리]: ");
						password = sc.next();
						if(password.length() == 4) {
							break;
						}
						System.out.println("비밀번호는 4자리로 설정해주세요.");
					}
					user.setPassword(password);
					
					arrBank[index][arCount[index]] = user;
					arCount[index]++;
					System.out.println("환영합니다 " + user.getName() +" 고객님, 계좌개설이 완료되었습니다.");
					System.out.println("계좌번호: " + user.getAccount());
					continue;
					
				}else if(choice == 5) { // 계좌번호 찾기
					System.out.print("핸드폰 번호: ");
					phoneNumber = sc.next();
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
					
					if(user != null) {
						System.out.print("비밀번호: ");
						password = sc.next();
						
						if(user.getPassword().equals(password)) {
							while(true) {
								for (int i = 0; i < ACCOUNT_LENGTH; i++) {
									account += random.nextInt(10);
								}
								userCheck = Bank.checkAccount(arrBank, arCount, account);
								if(userCheck == null) {break;}
							}
							System.out.println("새로운 계좌번호로 변경되었습니다.");
							System.out.println("계좌번호: " + account);
							account = user.getAccount().charAt(0) + account;
							user.setAccount(account);
						}
					}else {
						System.out.println("없는 핸드폰 번호입니다.");
					}
					continue;
				}
				
				System.out.print("계좌번호: ");
				account = sc.next();
				
				System.out.print("비밀번호: ");
				password = sc.next();
				
				user = Bank.login(arrBank, arCount, account, password);
				
				switch(choice) {
				case 0: // 주식 시장
					if(!(user instanceof KaKao)) {
						System.out.println("주식 서비스는 현재 카카오뱅크에서만 이용 가능합니다.");
						break;
					}
					String[] buttons = {"매도하기", "나가기"};
					KaKao kakaoUser = (KaKao)user;
					Thread stockThread = new Thread(kakaoUser);
					
					if(kakaoUser.getStockMoney() == 0) {
						System.out.print("투자액: ");
						kakaoUser.setPrincipal(sc.nextInt());
						kakaoUser.setStockMoney(kakaoUser.getPrincipal());
						kakaoUser.setMoney(kakaoUser.getMoney() - kakaoUser.getPrincipal());
						
						stockThread.start();
					}					
					
					synchronized (kakaoUser) {
						kakaoUser.isExit = false;
						kakaoUser.notify();
					}
					choice = JOptionPane.showOptionDialog(null, "", "매도 프로그램", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
					if(choice == 0) { // 매도하기
						kakaoUser.setMoney(kakaoUser.getMoney() + kakaoUser.getStockMoney());
						kakaoUser.setStockMoney(0);
						System.out.println("현재 잔액: " + kakaoUser.getMoney() + "원");
						stockThread.interrupt();
					}else { // 나가기
						kakaoUser.isExit = true;
					}
					break;
				case 2: // 입금하기(계좌를 개설한 은행에서만 입금 가능 '계좌번호에 무슨 은행인지 표시')
					if(user != null) {
						if(!user.getAccount().startsWith(index + "")) {
							System.out.println("계좌번호를 개설한 은행에서만 입금 서비스 이용이 가능합니다.");
							break;
						}
						
						System.out.print("입금액: ");
						money = sc.nextInt();
						if(money > 0) {
							user.deposit(money);
							System.out.println(money + "원 입금 완료");
						}else {
							System.out.println("입금액을 다시 확인해주세요.");
						}
					}else {
						System.out.println("로그인 실패");
					}
					break;
					
				case 3: // 출금하기
					if(user != null) {
						System.out.print("출금액: ");
						money = sc.nextInt();
						if(money > 0) {
							if(user.getMoney() >= (user instanceof Kookmin ? money * 1.5 : money)) {
								user.withdraw(money);
							}else {
								System.out.println("출금액을 다시 확인해주세요.");
							}
						}
					}else {
						System.out.println("로그인 실패");
					}
					break;
				case 4: // 잔액 조회
					if(user != null) {
						System.out.println("현재 잔액: " + user.showBalance());
					}else {
						System.out.println("로그인 실패");
					}
					break;
				}
			}
		}
	}
}













