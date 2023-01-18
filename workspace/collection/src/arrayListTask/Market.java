package arrayListTask;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
// 과일 검사
	public Fruit checkFruit(String name) {
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				return fruit;
			}
		}
		return null;
	}
	
//	과일 추가
	public void add(Fruit fruit) {
		fruits.add(fruit);
	}
	
//	과일 삭제
	public void remove(String name) {
		Fruit fruit = checkFruit(name);
		fruits.remove(fruit);
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
	public boolean checkPrice(int price) {
		return getAverage() > price;
	}
	
//	평균 가격
	private double getAverage() {
		int total = 0;
		
		for (Fruit fruit : fruits) {
			total += fruit.getPrice();
		}
		
		return (double)total / fruits.size();
	}
	
//	과일 전체 조회
	public ArrayList<Fruit> selectAll() {
		return fruits;
	}
	
//	과일 이름으로 가격 조회
	public int findByName(String name) {
		return checkFruit(name).getPrice();
	}
}











