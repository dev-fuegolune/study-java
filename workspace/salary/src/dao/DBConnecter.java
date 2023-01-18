package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// 디비쪽을 클래스로 만들어서 처리
public class DBConnecter {
	public static final String PATH = "salary.txt";
//	경로를 static final로 만들어서 변수화
	public static BufferedWriter getWriter() throws IOException {
		return new BufferedWriter(new FileWriter(PATH));
	}
	
	public static BufferedWriter getAppend() throws IOException {
//		이어쓰는 객체
		return new BufferedWriter(new FileWriter(PATH, true));
	}
	
	public static BufferedReader getReader() throws IOException {
		return new BufferedReader(new FileReader(PATH));
	}
}





















