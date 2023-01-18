package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		String[] games = {"배틀그라운드", "롤", "오버워치", "로스트아크", "메이플스토리", "스타크래프트"};
//		
////		배열로 파일에 출력하고 전체 내용을 가져와서 콘솔에 출력하기(문제)
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt", true));//true면 이어씀. 파일 출력
//		String test;
//		for (String game : games) {//향상된 for 문으로 돌림
//		 bufferedWriter.write(game + "\n");
//		 //write를 이용해서 출력할 내용을 담는다.
//		
//		}
//		bufferedWriter.close();
////		쓴거는 닫음.
//		
//		BufferedReader bufferedReader = null;
//		
//		String line = null;
////		비교할 값을 담을 라인변수를 만들어! 
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
//			//텍스트를 받아서 리더에 넣어줌(전체받음)
//			while((line = bufferedReader.readLine()) != null) {
////				라인에다가 라인을 읽는 메소드 한줄씩 써서 넣어준게 끝이 나기 전까지 계속 돌림
//				System.out.println(line);
////				출력
//			}
//		} catch (FileNotFoundException e) {
////			리더는 파일이 경로에 없으면 오류가 나니까 filenotfoundexception 오류가 뜸
//			System.out.println("잘못된 경로");
////			오류메세지
//			e.printStackTrace();
//		} finally {
////			catch 안잡혀도 들어가게
//			if(bufferedReader != null) {
////				버퍼리더에 값이 들어가 있으면 끝냄
//				bufferedReader.close();
//			}
//		}
//		
//		로스트 아크를 피파 2002로 변경(읽어와서 찾고 , 찾은걸 변경)
//		읽어옴
//		
			
		BufferedReader bufferedReader = null;
		String line = null, temp = "";
		final String TARGET = "로스트아크";
		
		try {
			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
			while((line = bufferedReader.readLine()) != null) {
//				라인에다가 한줄씩 담는다 끝까지
				if(line.equals(TARGET)) {
//					같은거 찾으면 안으로 들어와서
					temp += "피파2002\n";
//					템프에 피파2002를 넣어준다(수정)
					continue;//continue를 통해서 수정할 라인은 tmp에 안들어가도록 한다.
				}
//				같지 않으면 그대로 tmp에 line넣어줌
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 경로");
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
//		피파2002 삭제
//		BufferedReader bufferedReader = null;
//		String line = null, temp = "";
//		final String TARGET = "피파2002";
		
		try {
			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals(TARGET)) {
					continue;
				}
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt"));
//			생성자가 두개가 아니면 덮어쓰는게 된다. 파일을 불러와서 객체생성
			bufferedWriter.write(temp);
//			tmp를 넣어서 덮어쓴다
			bufferedWriter.close();
//			다쓴거는 닫는다
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 경로");
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
//				리더도 다쓰면 닫아줌.
				bufferedReader.close();
			}
		}
	}
}

















