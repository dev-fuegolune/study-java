package job;

import java.util.Random;
import java.util.Scanner;

// 타짜
// 족보(끗, 땡, 광땡)
// 나랑 상대방과 대결
// 계급: 호구, 물주, 마담, 타짜
// 패를 받을 시 추가 금액 설정
// 같은 패가 나올 시 다음 판 두 배
// 다이, 고 결정
// 판돈: 1억
// 연속 3회 승리 시 계급 상승

public class CardMaster {
	String nickname;
	int money;
	int level;
	int deck;
	int winCount;
	
	public CardMaster() {;}

	public CardMaster(String nickname, int money) {
		this.nickname = nickname;
		this.money = money;
	}
	
//	판돈 및 추가 금액을 받는다.
	void deposit(int money) {
		this.money -= money;
	}
	
//	끗(60) 땡(30) 광땡(10)
	void getMyDeck() {
		Random random = new Random();
		int[] rating = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2};
		this.deck = rating[random.nextInt(rating.length)];
	}
	
	int battle(CardMaster cardMaster) {
//		-1 : draw, 0 : lose, 1 : win
		boolean draw = this.deck == cardMaster.deck;
		boolean lose = this.deck > cardMaster.deck;
		boolean win = this.deck < cardMaster.deck;
		boolean[] status = {draw, lose, win};
		int result = 0;
		
		for (int i = -1; i < 2; i++) {
			if(status[1 + i]) {
				result = i;
				break;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] arLevel = {"호구", "물주", "마담", "타짜"};
		String[] decks = {"광땡", "땡", "끗"};
		String[] status = {"무승부", "패배", "승리"};
		String message = "1. 대결하기\n2. 나의 정보\n3. 나가기";
		String depositMessage = "1. 추가금액 입력\n2. 추가금액 없이 진행";
		int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;
		Scanner sc = new Scanner(System.in);
		CardMaster me = new CardMaster("고니", 0);
		CardMaster computer = new CardMaster("아귀", 0);
		String title = null;
		
		while (true) {
			title = "[" + arLevel[me.level] + "]" + me.nickname + " 자산: " + me.money + "\n"
					+ "[" + arLevel[computer.level] + "]" + computer.nickname + " 자산: " + computer.money;
			System.out.println(title);
			System.out.println(message);
			choice = sc.nextInt();
			
			if(choice == 3) {break;}
			
			switch(choice) {
			case 1: // 대결하기
				me.deposit(defaultMoney);
				computer.deposit(defaultMoney);
				money += defaultMoney * 2;
				me.getMyDeck();
				computer.getMyDeck();
				System.out.println("나의 패: " +decks[me.deck]);
				
				System.out.println(depositMessage);
				choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.print("추가 금액: ");
					depositMoney = sc.nextInt();
					me.deposit(depositMoney);
					computer.deposit(depositMoney);
					money += depositMoney * 2;
				}
				
				result = me.battle(computer);
				System.out.println(status[result + 1]);
				
				switch(result) {
				case -1: // 무승부
					while(result == -1) {
//						************************************************
						me.deposit(money);
						computer.deposit(money);
						money *= 3;
//						************************************************
//						money *= 2
						System.out.println(money);
						me.getMyDeck();
						System.out.println("나의 패: " +decks[me.deck]);
						System.out.println("1. 고\n2. 다이");
						choice = sc.nextInt();
						if(choice == 2) { 
							result = 0; 
							System.out.println(status[result + 1]);
							computer.money += money;
//							me.money -= money - (defaultMoney + depositMoney) * 2;
							me.winCount = 0;
							computer.winCount++;
							break;
						}
						result = me.battle(computer);
						System.out.println(status[result + 1]);
						
						switch(result) {
						case 0: // 패배
							computer.money += money;
//							me.money -= money - (defaultMoney + depositMoney) * 2;
							me.winCount = 0;
							computer.winCount++;
							break;
						case 1: // 승리
							me.money += money;
//							computer.money -= money - (defaultMoney + depositMoney) * 2;
							me.winCount++;
							computer.winCount = 0;
							break;
						}
					}
					break;
				case 0: // 패배
					computer.money += money;
					me.money -= money - (defaultMoney + depositMoney) * 2;
					me.winCount = 0;
					computer.winCount++;
					break;
				case 1: // 승리
					System.out.println(money);
					me.money += money;
					computer.money -= money - (defaultMoney + depositMoney) * 2;
					me.winCount++;
					computer.winCount = 0;
					break;
				}
				if(me.winCount > 2 && me.level < 3) {
					me.level++;
				}
				if(computer.winCount > 2 && computer.level < 3) {
					computer.level++;
				}
				money = 0;
				break;
			case 2: // 나의 정보
				break;
			default: // 그 외
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		
		
	}
}









