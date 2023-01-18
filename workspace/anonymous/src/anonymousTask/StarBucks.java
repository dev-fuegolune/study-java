package anonymousTask;

// 스타벅스 본사
public class StarBucks {
//	지점들이 처음에 한 번 등록할 때
//	본사에서 정해놓은 양식을 작성하여 form으로 전달한다. 
	public void register(Form form) {
//		지점에서 메뉴판 문제 없는 지 검사
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		
//		무료 나눔 매장일 경우
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 매장입니다.");
			return;
		}
//		정상 판매 매장일 경우 판매 방식 검사
		form.sell("아메리카노");
	}
}
