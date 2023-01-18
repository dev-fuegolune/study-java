package anonymousTask;

public class Building {
	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		StarBucks jamsil = new StarBucks();
		Nike jamsilNike = new Nike();
		Nike gangnamNike = new Nike();
		
		gangnamNike.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"티셔츠", "바지", "운동화", "모자"};
			}
		});
		
//		jamsilNike.register(new Form() {
//			
//			@Override
//			public void sell(String menu) {
//				String[] menus = getMenu();
//				for (int i = 0; i < menus.length; i++) {
//					if(menus[i].equals(menu)) {
//						System.out.println(menu + " 판매 완료");
//					}
//				}
//			}
//			
//			@Override
//			public String[] getMenu() {
//				return new String[] {"티셔츠", "바지", "운동화", "모자"};
//			}
//		});
		
////		메뉴만 구성하면 되기 때문에 FormAdapter로 작성한다.
//		jamsil.register(new FormAdapter() {
//			
//			@Override
//			public String[] getMenu() {
//				return new String[] {"물"};
//			}
//		});
//		
////		양식 전체를 작성해야 하기 때문에 Form을 작성한다.
//		gangnam.register(new Form() {
//			
//			@Override
//			public void sell(String menu) {
//				String[] menus = getMenu();
//				for (int i = 0; i < menus.length; i++) {
//					if(menus[i].equals(menu)) {
//						System.out.println(menu + " 판매 완료");
//					}
//				}
//			}
//			
//			@Override
//			public String[] getMenu() {
//				return new String[] {"아메리카노", "카푸치노", "아포가토", "미니언 비행기"};
//			}
//		});
	}
}









