package exceptionTest;

// Exception 상속: 컴파일러가 체크
// RuntimeException 상속: 컴파일러가 체크하지 않음
public class BadWordException extends Exception {
	
	public BadWordException(String message) {
		super(message);
	}
}
