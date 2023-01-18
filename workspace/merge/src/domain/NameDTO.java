package domain;

import dao.NameDAO;

public class NameDTO extends Name{
	private String gender;
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return gender + "\t" + getName() + "\t" + getRanking() + "\t" + NameDAO.insertComma(getPopulation());
	}
}
