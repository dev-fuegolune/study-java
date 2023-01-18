package hashMapTest;


import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
	public static void main(String[] args) {
		User user = new User(1, "hds1234", "1234", "ÇÑµ¿¼®", 20);
		JSONObject userJSON = new JSONObject(user);
		JSONObject infoJSON = new JSONObject();
		try {
			infoJSON.put("info", userJSON);
			System.out.println(infoJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		try {
			userJSON = infoJSON.getJSONObject("info");
			System.out.println(userJSON.get("id"));
			System.out.println(userJSON.get("password"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
}

















