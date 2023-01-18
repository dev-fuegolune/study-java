package threadTest;

public class Thread2 implements Runnable{//Runnable 을 implement하는 클래스
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());//run 자원에 접근하는 현재의 쓰레드 이름을 반환한다
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
