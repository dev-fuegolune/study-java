package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread2 thread = new Thread2();
//		���ʺ���  �Լ��� �������̽�. ���ٽ����� ��������
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(50);} catch (InterruptedException e) {;}
			}
		};
		
//		Thread t1 = new Thread(target, "?");
//					�����ڷ� runnable �ν��Ͻ��ּҰ��� �޾Ƽ� �������� run()���
		Thread t2 = new Thread(target, "!");
		
		t2.start();
		
//		try {t2.join();} catch (InterruptedException e) {;}
//		t2�� join�� �Ἥ �켱������ �����ش�. 
//		t1.start();
		
		
		Thread1 t1 = new Thread1("��");
//		Thread1 t2 = new Thread1("��");
//		
		t1.start();
//		t2.start();
//		
		System.out.println("�ȳ�");
//		t1.run();
		t2.run();
	}
}














