package anonymous;

public class Computer {
	public static void main(String[] args) {
//		인터페이스에 구현되지 않은 필드가 존재하기 때문에,
//		익명 클래스가 열린 뒤 인터페이스를 지정하여 구현시킨다.
//		구현된 익명 클래스의 필드가 메모리에 할당된 뒤 인터페이스 타입의
//		객체로 up casting된다.
		Game game = new Game() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
