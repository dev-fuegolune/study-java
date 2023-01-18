package classTest;

public class Student {
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double average;

	public Student(int number, int kor, int eng, int math) {
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total / 3.0;
	}
}


















