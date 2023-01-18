package threadTask;

public class Zoo {
	
	public static void main(String[] args) {
//		람다식으로 run() 재정의
		Runnable animal = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(400);} catch (InterruptedException e) {;}
			}
		};
		
//		구현된 animal 객체를 makeSounds에 전달
		new Animal().makeSounds(animal);
	}
}
