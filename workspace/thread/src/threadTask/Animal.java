package threadTask;

public class Animal{
	
//	구현된 자원을 animal로 받음
	public void makeSounds(Runnable animal) {
		String[] sounds = {"어흥", "매에", "음메"};
		Thread[] threads = new Thread[sounds.length];
		
//		각 쓰레드에 동일한 자원에 접근하도록 설정하고, 각 이름을 울음소리로 설정한다.
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
//			각 쓰레드를 스케줄링 한 뒤 2개의 쓰레드가 동시에 start 되고, 마지막 쓰레드만 join을 통해 멈춰준다.
			threads[i].start();
			if(i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
	}
	
}
