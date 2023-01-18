package codingTest;

public class Locker {
	public int solution(String p, String s) {
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int number = p.charAt(i), target = s.charAt(i), result = target - number;
			answer += Math.abs(result) > 4 ? 10 - result : Math.abs(result);
		}
		return answer;
	}
}
