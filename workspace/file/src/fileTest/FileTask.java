package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		String[] games = {"��Ʋ�׶���", "��", "������ġ", "�ν�Ʈ��ũ", "�����ý��丮", "��Ÿũ����Ʈ"};
//		
////		�迭�� ���Ͽ� ����ϰ� ��ü ������ �����ͼ� �ֿܼ� ����ϱ�(����)
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt", true));//true�� �̾. ���� ���
//		String test;
//		for (String game : games) {//���� for ������ ����
//		 bufferedWriter.write(game + "\n");
//		 //write�� �̿��ؼ� ����� ������ ��´�.
//		
//		}
//		bufferedWriter.close();
////		���Ŵ� ����.
//		
//		BufferedReader bufferedReader = null;
//		
//		String line = null;
////		���� ���� ���� ���κ����� �����! 
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
//			//�ؽ�Ʈ�� �޾Ƽ� ������ �־���(��ü����)
//			while((line = bufferedReader.readLine()) != null) {
////				���ο��ٰ� ������ �д� �޼ҵ� ���پ� �Ἥ �־��ذ� ���� ���� ������ ��� ����
//				System.out.println(line);
////				���
//			}
//		} catch (FileNotFoundException e) {
////			������ ������ ��ο� ������ ������ ���ϱ� filenotfoundexception ������ ��
//			System.out.println("�߸��� ���");
////			�����޼���
//			e.printStackTrace();
//		} finally {
////			catch �������� ����
//			if(bufferedReader != null) {
////				���۸����� ���� �� ������ ����
//				bufferedReader.close();
//			}
//		}
//		
//		�ν�Ʈ ��ũ�� ���� 2002�� ����(�о�ͼ� ã�� , ã���� ����)
//		�о��
//		
			
		BufferedReader bufferedReader = null;
		String line = null, temp = "";
		final String TARGET = "�ν�Ʈ��ũ";
		
		try {
			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
			while((line = bufferedReader.readLine()) != null) {
//				���ο��ٰ� ���پ� ��´� ������
				if(line.equals(TARGET)) {
//					������ ã���� ������ ���ͼ�
					temp += "����2002\n";
//					������ ����2002�� �־��ش�(����)
					continue;//continue�� ���ؼ� ������ ������ tmp�� �ȵ����� �Ѵ�.
				}
//				���� ������ �״�� tmp�� line�־���
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���");
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
//		����2002 ����
//		BufferedReader bufferedReader = null;
//		String line = null, temp = "";
//		final String TARGET = "����2002";
		
		try {
			bufferedReader = new BufferedReader(new FileReader("src/game.txt"));
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals(TARGET)) {
					continue;
				}
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/game.txt"));
//			�����ڰ� �ΰ��� �ƴϸ� ����°� �ȴ�. ������ �ҷ��ͼ� ��ü����
			bufferedWriter.write(temp);
//			tmp�� �־ �����
			bufferedWriter.close();
//			�پ��Ŵ� �ݴ´�
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���");
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
//				������ �پ��� �ݾ���.
				bufferedReader.close();
			}
		}
	}
}

















