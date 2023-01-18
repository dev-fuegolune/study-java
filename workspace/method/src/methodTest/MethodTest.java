package methodTest;

public class MethodTest {
//	두 정수의 곱셈 메소드 선언
	int multiple(int number1, int number2){
		int result = number1 * number2;
		return result;
	}
	
//	static
//		컴파일러가 가장 먼저 메모리에 할당해준다.
//		일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//		1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//		2. 일반 메소드의 소속을 알려준다.
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		methodTest.multiple(1, 3);
	}
}




















