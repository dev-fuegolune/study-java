package view;

import java.io.IOException;

import dao.SalaryDAO;
import domain.SalaryVO;

public class Test {
	public static void main(String[] args) throws IOException{
		SalaryVO salaryVO = new SalaryVO();
		SalaryDAO salaryDAO = new SalaryDAO();
//		
		salaryVO.setSalary(15100);
		salaryVO.setIncomeTax(1000000);
		salaryVO.setNetPay(9_000_000);
//		salaryDAO.remove(salaryVO);
//		
//		salaryDAO.insert(salaryVO);
//		
//		salaryDAO.update(salaryVO);

		
		
	}
}














