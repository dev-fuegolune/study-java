package anonymousTask;

// 지점별로 반드시 작성해야 하는 양식
public interface Form {
//	메뉴판
	public String[] getMenu();
//	판매 방식
	public void sell(String menu);
}
