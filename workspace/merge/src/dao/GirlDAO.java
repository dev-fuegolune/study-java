package dao;

import domain.GirlVO;

public class GirlDAO {
	public GirlVO setObject(String line) {
		String[] datas = line.split("\t");
		GirlVO girlVO = new GirlVO();
		int i = 0;
		girlVO.setName(datas[i++]);
		girlVO.setRanking(Integer.parseInt(datas[i++].replaceAll(",", "")));
		girlVO.setPopulation(Integer.parseInt(datas[i++].replaceAll(",", "")));
		
		return girlVO;
	}
}
