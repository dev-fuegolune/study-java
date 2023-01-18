package hashMapTest;

import java.util.HashMap;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest {
	public static void main(String[] args) {
		User user = new User(1, "hds1234", "1234", "한동석", 20);
//		객체를 JSON형식으로 변경
		JSONObject userJSON = new JSONObject(user);
		JSONParser parser = new JSONParser();
		System.out.println(userJSON);
		
		try {
//			JSON 형식의 문자열을 HashMap으로 변경
			HashMap<String, Object> result = (HashMap)(parser.parse(userJSON.toString()));
			System.out.println(result.get("number"));
			System.out.println(result.get("id"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}












