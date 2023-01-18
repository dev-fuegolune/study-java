package hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null;
		
//		String text = "";
		
		userMap.put("id", "hds1234");
		userMap.put("password", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		userJSON = new JSONObject(userMap);
		try {
			userJSON.put("gender", "선택안함");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		System.out.println(userJSON);
		
//		System.out.println(userMap);
//		System.out.println(userMap.get("id"));
		
		
//		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		text = "{";
//		while(iter.hasNext()) {
//			Entry<String, Object> entry = iter.next();
//			text += entry.getKey();
//			text += ":";
//			text += entry.getValue();
//			text += ",";
//		}
//		text = text.substring(0, text.lastIndexOf(","));
//		text += "}";
//		
//		
//		System.out.println(text);
	}
}




















