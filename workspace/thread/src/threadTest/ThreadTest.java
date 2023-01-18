package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread2 thread = new Thread2();
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(50);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t2.start();
		
		try {t2.join();} catch (InterruptedException e) {;}
		
		t1.start();
		
		System.out.println("¾È³ç");
		
//		Thread1 t1 = new Thread1("¢¾");
//		Thread1 t2 = new Thread1("¡Ú");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
	}
}














