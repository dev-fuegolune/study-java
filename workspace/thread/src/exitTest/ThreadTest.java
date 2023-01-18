package exitTest;

public class ThreadTest implements Runnable {
	public static boolean isExit;
	
	@Override
	public void run() {
		int count = 0;
		System.out.println(count);
		while(true) {
			System.out.println("진행중...");
			if(Thread.interrupted()) {
				System.out.println("InterruptedException으로 종료");
				break;
			}
//			if (++count == 5) {
//				synchronized (this) {
//					try {count = 0; System.out.println(count); wait();} catch (InterruptedException e) {System.out.println("Exception으로 쓰레드 종료"); break;}
//				}
//			}
//			try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("Exception으로 쓰레드 종료"); break;}
//			if(isExit) {System.out.println("static 필드로 쓰레드 종료"); break;}
		}
	}
}
