package hashMapTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
		JSONObject productJSON = new JSONObject();
		JSONArray products = new JSONArray();
		
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		Product shoes = new Product(1, "나이키", 129_000, 32);
		JSONObject shoesJSON = new JSONObject(shoes);
//		System.out.println(shoesJSON);
//		2. JSON형식의 상품 정보 중 상품 재고 출력
//		try {
//			System.out.println(shoesJSON.get("stock"));
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
		
//		3. 할인 중인 상품 정보 제작
		Product bag = new Product(2, "샤넬", 12_000_000, 2);
		
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
		JSONObject bagJSON = new JSONObject(bag);
//		6. JSON에 할인율 필드 추가
		try {
			bagJSON.put("discount", 30);
		} catch (JSONException e) {
			e.printStackTrace();
		}
//		7. JSON형식의 상품 정보 중 할인율 출력
		try {
			System.out.println(bagJSON.get("discount"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		신발과 가방을 하나로 묶어보자!
		try {
			products.put(bagJSON);
			products.put(shoesJSON);
//			System.out.println(products);
			System.out.println(products.getJSONObject(0).get("price"));
//			productJSON.put("shoes", shoesJSON);
//			productJSON.put("bag", bagJSON);
//			System.out.println(productJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}












