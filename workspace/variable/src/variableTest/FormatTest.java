package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "한동석";
		int age = 20;
		double height = 123.55;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("몸무게 : %.2fkg\n", height); // 반올림		
	}
}
