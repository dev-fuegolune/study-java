package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {

	public ArrayList<Love> loves = DBConnecter.loves;
	
//	이상형 추가
	public void add(Love love) {
		loves.add(love);
	}
	
//	사용자가 원하는 나이의 이상형 목록 조회
	public ArrayList<Love> findAllByAge(int age) {
		ArrayList<Love> results = new ArrayList<Love>();
		for (Love love : loves) {
			if(love.getAge() == age) {
				results.add(love);
			}
		}
		return results;
	}
	
//	이상형의 나이 수정
	public void updateAge(Love love) {
		for (Love loveInDatabase : loves) {
			if(loveInDatabase.getNumber() == love.getNumber()) {
				loveInDatabase.setAge(love.getAge());
			}
		}
	}
	
//	이상형 나이 순 정렬
	public void sort() {
//		DB에 있는 이상형들을 나이 순으로 정렬한 결과
		ArrayList<Love> results = new ArrayList<Love>();
		
//		이상형들의 나이만 담을 자료구조
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
//		loves에서 나이를 가져와서 ages에 추가
		for (Love love : loves) {
			ages.add(love.getAge());
		}
		
//		오름차순으로 정렬
		Collections.sort(ages);
		
		for (int age : ages) {
			for (int i=0; i<loves.size(); i++) {
				if(loves.get(i).getAge() == age) {
					results.add(loves.get(i));
					loves.remove(loves.get(i));
				}
			}
		}
		loves = results;
	}
}














