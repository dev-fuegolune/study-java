package threadTest;

public class Thread2 implements Runnable{//Runnable �� implement�ϴ� Ŭ����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());//run �ڿ��� �����ϴ� ������ ������ �̸��� ��ȯ�Ѵ�
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
