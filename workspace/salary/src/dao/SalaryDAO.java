package dao;

//DB�� ������ �� �ִ� �޼ҵ���� ����� Ŭ����
//���⼭ ó���ؼ� salaryVO ��ü�� ���� ����ص� ó��
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import domain.SalaryVO;

public class SalaryDAO {
//	�߰�
//	public void insert(SalaryVO salaryVO) throws IOException{
////		�޼��� �߰� 
//		BufferedWriter bufferedWriter = DBConnecter.getAppend();
////		bd���� ����� ���� �̾�� ��ü���� �����ͼ� ��ü�� ���� �� Ŭ������ ����???new BufferedWriter(new FileWriter(PATH, true));												
//		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
////		������ ��� ���� ����Ʈ ������ �о ����Ʈ. readAllBytes�� �Ű������� path�� PathsŬ������ get�޼ҵ带 �����
//		String temp = null;
//		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
//		temp += salaryVO.toString();
//		//�߰��� ������ temp�� �����. �װ� toString���� ������
//		bufferedWriter.write(temp);
////	append�� �̾�°Ŵϱ� �� ��ü�� �̾��
//		bufferedWriter.close();
//	}
//	
////	����(�ҵ漼)
//	public void update(SalaryVO salaryVO) throws IOException {//������ �޾ƿ�
//		BufferedReader bufferedReader = DBConnecter.getReader();
//		String line = null, temp = "";
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
//				String data = line.substring(0, line.lastIndexOf("   "));
////				 if�� �ȿ� ���Դٴ� �Ŵ� ���� salary ã�Ҵٴ°�. ã���� ���� ��ĭ������ 
////				���� data�� ����ش�
//				
//				temp += data.substring(0, data.lastIndexOf("   ")) + "   "
//						+ insertComma(salaryVO.getIncomeTax()) + "   "
//						+ insertComma(salaryVO.getLocalTax()) + "\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
//		BufferedWriter bufferedWriter = DBConnecter.getWriter();
//		bufferedWriter.write(temp);
//		
//		bufferedWriter.close();
//		bufferedReader.close();
//	}
//	���� (��ȸ �о�� ������ ���԰� �־��� �׸��� �����)   
//	public void remove(SalaryVO salary) throws IOException{
//	String line ="", tmp =null;	
//	BufferedReader bufferedReader = DBConnecter.getReader();
////	������ �����´�
//	while((line=bufferedReader.readLine()) != null) {
//		if(line.split("   ")[0].equals(insertComma(salary.getSalary())+"����")){
//			continue;
//		}
//		tmp += line+"\n";	
//	}
////	 ���۸� ��ߵ�. ��ü���� 
//	BufferedWriter bufferedWriter = DBConnecter.getWriter();
//	bufferedWriter.write(tmp);
//	bufferedReader.close();
//	bufferedWriter.close();
//	}
//	��ȸ(�����˻� -int �� �޾Ƽ� ���۸����� �ϳ��� �о�ͼ� �˻�. 
	public SalaryVO searchSalary(int salary) throws IOException {
		SalaryVO salaryVO = new SalaryVO();
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		String[] result = null;

		while ((line = bufferedReader.readLine()) != null) {

			if (line.split("   ")[0].equals(insertComma(salary) + "����")) {
				line = line.replaceAll(",", "").replaceAll("����", "");
				result = line.split("   ");
				salaryVO.setSalary(Integer.parseInt(result[0]));
				salaryVO.setNetPay(Integer.parseInt(result[1]));
				salaryVO.setTaxDeductionAmount(Integer.parseInt(result[2]));
				salaryVO.setPension(Integer.parseInt(result[3]));
				salaryVO.setHealthInsurance(Integer.parseInt(result[4]));
				salaryVO.setLongTermCarePay(Integer.parseInt(result[5]));
				salaryVO.setEmploymentInsurance(Integer.parseInt(result[6]));
				salaryVO.setIncomeTax(Integer.parseInt(result[7]));
				salaryVO.setLocalTax(Integer.parseInt(result[8]));
				return salaryVO;
			}
		}
		bufferedReader.close();
		return null;
	}

//	���
	public static ArrayList<SalaryVO> selectAll() throws IOException {
		ArrayList<SalaryVO> arraySalaryVO = new ArrayList<SalaryVO>();
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		String[] result = null;

		while ((line = bufferedReader.readLine()) != null) {
			SalaryVO salaryVO = new SalaryVO();
			line = line.replaceAll(",", "").replaceAll("����", "");
			result = line.split("   ");
			salaryVO.setSalary(Integer.parseInt(result[0]));
			salaryVO.setNetPay(Integer.parseInt(result[1]));
			salaryVO.setTaxDeductionAmount(Integer.parseInt(result[2]));
			salaryVO.setPension(Integer.parseInt(result[3]));
			salaryVO.setHealthInsurance(Integer.parseInt(result[4]));
			salaryVO.setLongTermCarePay(Integer.parseInt(result[5]));
			salaryVO.setEmploymentInsurance(Integer.parseInt(result[6]));
			salaryVO.setIncomeTax(Integer.parseInt(result[7]));
			salaryVO.setLocalTax(Integer.parseInt(result[8]));
			arraySalaryVO.add(salaryVO);

		}
		bufferedReader.close();
		return arraySalaryVO;
	}

	public static String insertComma(int number) {
		String temp = String.valueOf(number);
		String result = "";

		for (int i = 0; i < temp.length(); i++) {
			if (i != 0 && i % 3 == 0) {
				result = "," + result;
			}
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}

}
