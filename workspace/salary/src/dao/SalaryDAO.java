package dao;

//DB에 접근할 수 있는 메소드들이 선언된 클래스
//여기서 처리해서 salaryVO 객체를 만들어서 담아준뒤 처리
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import domain.SalaryVO;

public class SalaryDAO {
//	추가
//	public void insert(SalaryVO salaryVO) throws IOException{
////		메서드 추가 
//		BufferedWriter bufferedWriter = DBConnecter.getAppend();
////		bd에서 만들어 놓은 이어쓰는 객체값을 가져와서 객체를 만들어서 이 클래스에 연결???new BufferedWriter(new FileWriter(PATH, true));												
//		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
////		파일의 모든 글을 바이트 단위로 읽어서 컨텐트. readAllBytes의 매개변수가 path라서 Paths클래스의 get메소드를 사용함
//		String temp = null;
//		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
//		temp += salaryVO.toString();
//		//추가할 한줄을 temp에 담아줌. 그거 toString으로 재정의
//		bufferedWriter.write(temp);
////	append가 이어쓰는거니까 이 객체는 이어쓰는
//		bufferedWriter.close();
//	}
//	
////	수정(소득세)
//	public void update(SalaryVO salaryVO) throws IOException {//정보를 받아옴
//		BufferedReader bufferedReader = DBConnecter.getReader();
//		String line = null, temp = "";
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//				String data = line.substring(0, line.lastIndexOf("   "));
////				 if문 안에 들어왔다는 거는 같은 salary 찾았다는거. 찾으면 끝에 빈칸세개를 
////				빼고 data에 담아준다
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
//	삭제 (조회 읽어옴 맞으면 빼먹고 넣어줌 그리고 덮어쓴다)   
//	public void remove(SalaryVO salary) throws IOException{
//	String line ="", tmp =null;	
//	BufferedReader bufferedReader = DBConnecter.getReader();
////	리더로 가져온다
//	while((line=bufferedReader.readLine()) != null) {
//		if(line.split("   ")[0].equals(insertComma(salary.getSalary())+"만원")){
//			continue;
//		}
//		tmp += line+"\n";	
//	}
////	 버퍼를 써야됨. 객체생성 
//	BufferedWriter bufferedWriter = DBConnecter.getWriter();
//	bufferedWriter.write(tmp);
//	bufferedReader.close();
//	bufferedWriter.close();
//	}
//	조회(연봉검색 -int 로 받아서 버퍼리더로 하나씩 읽어와서 검색. 
	public SalaryVO searchSalary(int salary) throws IOException {
		SalaryVO salaryVO = new SalaryVO();
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		String[] result = null;

		while ((line = bufferedReader.readLine()) != null) {

			if (line.split("   ")[0].equals(insertComma(salary) + "만원")) {
				line = line.replaceAll(",", "").replaceAll("만원", "");
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

//	목록
	public static ArrayList<SalaryVO> selectAll() throws IOException {
		ArrayList<SalaryVO> arraySalaryVO = new ArrayList<SalaryVO>();
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		String[] result = null;

		while ((line = bufferedReader.readLine()) != null) {
			SalaryVO salaryVO = new SalaryVO();
			line = line.replaceAll(",", "").replaceAll("만원", "");
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
