package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public boolean check(int number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
//		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		
//		chinaTown.put("자장면", 4500);
//		chinaTown.put("짬뽕", 6500);
//		chinaTown.put("탕수육", 14500);
		
//		forEach()
//		여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach() 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 이씨다.
//		매개변수에는 컬렉션 객체 안에 들어있는 값들이 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
		
//		chinaTown.values().stream().forEach(v -> System.out.println(v));
//		chinaTown.values().forEach(v -> System.out.println(v));
//		chinaTown.values().forEach(System.out::println);
		
//		datas.forEach(data -> System.out.println(data));
//		datas.forEach(System.out::println);
		
//		IntStream.range(1, 10).forEach(v -> datas.add(v));
//		IntStream.range(1, 10).forEach(datas::add);
		
//		chars(): 문자열을 IntStream으로 변경
//		String data = "ABC";
//		data.chars().forEach(System.out::println);
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		map(): 기존 값을 원하는 값으로 변경
//		String data = "ABC";
//		data.chars().map(c -> c + 3).forEach(c -> System.out.print((char)c));
		
//		ArrayList<User> users = new ArrayList<User>(Arrays.asList(
//				new User(1, "한동석", 20), 
//				new User(2, "홍길동", 21), 
//				new User(3, "이순신", 31)));
		
//		받은 값을 메소드에 바로 전달할 때에는 객체로 참조형을 작성하고,
//		메소드에 값을 전달하지 않고 그냥 사용할 때에는 클래스로 참조형을 작성한다.
//		users.stream().map(User::getAge).forEach(System.out::println);
		
//		filter() : 조건식이 true일 경우만 추출
//		StreamTest streamTest = new StreamTest();
//		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).filter(n -> streamTest.check(n)).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).filter(streamTest::check).forEach(System.out::println);
		
//		sorted()
//		Integer[] arData = {10, 40, 23, 32, 50};
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
		
//		datas.stream().sorted().forEach(System.out::println);
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect() : 결과를 다양한 타입으로 리턴해준다.
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 40, 23, 32, 50));
//		ArrayList<Integer> results = 
//			(ArrayList<Integer>)datas.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(results);
		
//		ArrayList<Integer> times = new ArrayList<Integer>(Arrays.asList(10, 3, 2));
//		String result = times.stream().map(String::valueOf).collect(Collectors.joining(":"));
//		System.out.println(result);
	}
}























