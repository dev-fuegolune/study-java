package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// ������� Ŭ������ ���� ó��
public class DBConnecter {
	public static final String PATH = "salary.txt";
//	��θ� static final�� ���� ����ȭ
	public static BufferedWriter getWriter() throws IOException {
		return new BufferedWriter(new FileWriter(PATH));
	}
	
	public static BufferedWriter getAppend() throws IOException {
//		�̾�� ��ü
		return new BufferedWriter(new FileWriter(PATH, true));
	}
	
	public static BufferedReader getReader() throws IOException {
		return new BufferedReader(new FileReader(PATH));
	}
}





















