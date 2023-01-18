package fileTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

//		절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//		상대 경로: 현재 위치에 따라 변경되는 경로, ../a/b
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt", true));
//		bufferedWriter.write("안녕");
//		bufferedWriter.close();
		
		BufferedReader bufferedReader = null; 
//		입력 클래스를 전역 변수로 선언 
		try {
			bufferedReader = new BufferedReader(new FileReader("src/test2.txt"));
//			버퍼리더 생성자에는 파일리더를 넣어야 함    fileReader-전달한 경로의 파일을 입력하기 위한 목적
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				//모든 줄을 다 가져올 때 까지 돌려서
				System.out.println(line);
//				라인을 출력
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 경로");
		} finally {
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
//		성능 저하 및 다양한 결함이 발생하여, 9버전 이후 부터는 사용하지 말고 close()를 쓰자!
//		System.gc();
//		System.runFinalization();
		
//		File file = new File("src/test.txt");
//		if (file.exists()) {
//			file.delete();
//		}
	}
}











