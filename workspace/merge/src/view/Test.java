package view;

import java.io.IOException;

import dao.NameDAO;

public class Test {
	public static void main(String[] args) throws IOException {
		NameDAO nameDAO = new NameDAO();
		
		nameDAO.merge("boy.txt", "girl.txt", "name.txt");
		nameDAO.updateRanking("name.txt");
	}
}
