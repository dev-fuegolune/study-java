package dao;

import domain.BoyVO;

public class BoyDAO {
	public BoyVO setObject(String line) {
		String[] datas = line.split("\t");
		BoyVO boyVO = new BoyVO();
		int i = 0;
		boyVO.setName(datas[i++]);
		boyVO.setRanking(Integer.parseInt(datas[i++].replaceAll(",", "")));
		boyVO.setPopulation(Integer.parseInt(datas[i++].replaceAll(",", "")));
		
		return boyVO;
	}
}
