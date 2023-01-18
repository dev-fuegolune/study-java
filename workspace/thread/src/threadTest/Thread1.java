package threadTest;

public class Thread1 extends Thread{//Thread클래스를 상속받는 클래스
	public String data;
	
	public Thread1() {;}

	public Thread1(String data) {
		super();
		this.data = data;
	}
//run을 재정의	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}
