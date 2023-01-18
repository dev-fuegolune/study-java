package castingTest;

public class Encryption {
		public static void main(String[] args) {
			String password = "ehdtjrdl";
			String encryptedPassword = "";
			String decryptedPassword = "";
			
			final int KEY = 3;
			
			for (int i = 0; i < password.length(); i++) {
				encryptedPassword += (char)(password.charAt(i) * 3);
			}
			
			System.out.println(encryptedPassword);
			
			for (int i = 0; i < encryptedPassword.length(); i++) {
				decryptedPassword += (char)(encryptedPassword.charAt(i) / 3);
			}
			
			System.out.println(decryptedPassword);
		}

}













