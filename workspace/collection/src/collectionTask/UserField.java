package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;
	private final int NUMBER_LENGTH = 5;
	
//	아이디 중복검사
	public User checkId(String id) {
		User user = null;
		
		for(User temp : users) {
			if(temp.getId().equals(id)) {
				user = temp;
				break;
			}
		}
		
		return user;
	}
	
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}
	
//	암호화
	private String encrypt(String password) {
		String encryptedPassword = "";
		
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);
		}
		
		return encryptedPassword;
	}
	
//	로그인
	public User login(String id, String password) {
		User user = checkId(id);
		if(user != null) {
			if(user.getPassword().equals(encrypt(password))) {
				return user;
			}
		}
		return null;
	}
	
//	비밀번호 변경
	public void changePassword(User user) {
		User userInDataBase = checkId(user.getId());
		userInDataBase.setPassword(encrypt(user.getPassword()));
	}
	
//	인증번호 생성
	private String getNumber() {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < NUMBER_LENGTH; i++) {
			number += random.nextInt(10);
		}
		return number;
	}
	
//	인증번호 전송
	public String sendMessage(String phoneNumber) {
		String number = getNumber();
		String api_key = "";
	    String api_secret = "";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", phoneNumber);
	    params.put("from", "01000000000");
	    params.put("type", "SMS");
	    params.put("text", "회사명\n인증번호를 정확히 입력해주세요.\n[" + number + "]");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	    
	    return number;
	}
}


















