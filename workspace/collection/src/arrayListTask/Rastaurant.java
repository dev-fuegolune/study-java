package arrayListTask;

import java.util.ArrayList;

public class Rastaurant {
	ArrayList<Food> foods = DBConnecter.foods;
	
//	음식 추가
	public void add(Food food) {
		foods.add(food);
	}
	
//	음식 이름으로 음식 종류 조회
	public String findKindByName(String name) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getKind();
			}
		}
		return null;
	}
	
//	사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> findAllByKind(String kind){
		ArrayList<Food> results = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				results.add(food);
			}
		}
		return results;
	}
	
//	음식 종류 수정 후 가격 10% 상승
	public void update(Food food) {
		for (Food foodInDatabase : foods) {
			if(foodInDatabase.getName().equals(food.getName())) {
				foodInDatabase.setKind(food.getKind());
				foodInDatabase.setPrice((int)(foodInDatabase.getPrice() * 1.1));
			}
		}
	}
	
//	사용자가 원하는 종류의 음식 개수 조회
	public int getCountByKind(String kind) {
		int count = 0;
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				count ++;
			}
		}
		return count;
	}
}











