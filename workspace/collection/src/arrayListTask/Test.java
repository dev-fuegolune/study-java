package arrayListTask;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		Love[] loves = {
			new Love(1, "홍길동", 20),	
			new Love(2, "이순신", 25),	
			new Love(3, "장보고", 20),	
			new Love(4, "박혁거세", 23),	
		};
		
		for (int i = 0; i < loves.length; i++) {
			dateApp.add(loves[i]);
		}
		
		dateApp.sort();
		
		System.out.println(dateApp.loves);
	}
}















