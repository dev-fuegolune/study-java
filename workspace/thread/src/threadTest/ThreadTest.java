package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread2 thread = new Thread2();
//		러너블은  함수형 인터페이스. 람다식으로 구현가능
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(50);} catch (InterruptedException e) {;}
			}
		};
		
//		Thread t1 = new Thread(target, "?");
//					생성자로 runnable 인스턴스주소값을 받아서 재정의한 run()사용
		Thread t2 = new Thread(target, "!");
		
		t2.start();
		
//		try {t2.join();} catch (InterruptedException e) {;}
//		t2에 join을 써서 우선순위를 높여준다. 
//		t1.start();
		
		
		Thread1 t1 = new Thread1("♥");
//		Thread1 t2 = new Thread1("★");
//		
		t1.start();
//		t2.start();
//		
		System.out.println("안녕");
//		t1.run();
		t2.run();
	}
}














