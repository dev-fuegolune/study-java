package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import domain.BoyVO;
import domain.GirlVO;
import domain.Name;
import domain.NameDTO;

public class NameDAO {
	public ArrayList<GirlVO> girls = new ArrayList<GirlVO>();
	public ArrayList<BoyVO> boys = new ArrayList<BoyVO>();
	
	public void merge(String path1, String path2, String path3) throws IOException {
		BufferedReader boyReader = DBConnecter.getReader(path1);
		BufferedReader girlReader = DBConnecter.getReader(path2);
		BufferedWriter bufferedWriter = null;
		
		GirlDAO girlDAO = new GirlDAO();
		BoyDAO boyDAO = new BoyDAO();
		
		String line = null, temp = "";
		
		while((line = boyReader.readLine()) != null) {
			boys.add(boyDAO.setObject(line));
			temp += line + "\n";
		}
		
		boyReader.close();
		
		while((line = girlReader.readLine()) != null) {
			girls.add(girlDAO.setObject(line));
			temp += line + "\n";
		}
		
		girlReader.close();
		
		bufferedWriter = DBConnecter.getWriter(path3);
		
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
	
	public void updateRanking(String path) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getWriter(path);
		ArrayList<Name> names = new ArrayList<Name>();
		List<Integer> populations = null;
		HashSet<Integer> populationSet = null;
		int ranking = 1, count = 0;
		String temp = "";
		
		names.addAll(girls);
		names.addAll(boys);
		
		populationSet = new HashSet(names.stream()
				.map(Name::getPopulation).collect(Collectors.toList()));
		
		populations = new ArrayList<Integer>(populationSet).stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		for (Integer population : populations) {
			count = 0;
			for (Name nameVO : names) {
				if(population == nameVO.getPopulation()) {
					NameDTO nameDTO = new NameDTO();
					nameDTO.setGender(nameVO instanceof BoyVO ? "B" : "G");
					nameDTO.setName(nameVO.getName());
					nameDTO.setRanking(ranking);
					nameDTO.setPopulation(nameVO.getPopulation());
					temp += nameDTO.toString() + "\n";
					
					count++;
				}
			}
			if(count > 1) {
				ranking += count;
				continue;
			}
			ranking ++;
		}
		
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
	
	public static String insertComma(int number) {
		String temp = String.valueOf(number);
		String result = "";
		
		for (int i = 0; i < temp.length(); i++) {
			if(i != 0 && i % 3 == 0) {
				result = "," + result;
			}
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}
}














