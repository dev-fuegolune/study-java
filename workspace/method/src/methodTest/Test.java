package methodTest;

public class Test {
	void change(int[] data) {
		data[0] = 20;
	}
	
	public static void main(String[] args) {
		int[] data = {10};
		new Test().change(data);
		System.out.println(data[0]);
	}
}





















