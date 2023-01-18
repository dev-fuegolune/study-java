package apiTest;

import java.util.Date;
import java.util.Properties;

//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Message.RecipientType;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;

public class MailTest {
	public static void main(String[] args) {
//	      // 메일 인코딩
//	       final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
//	       
//	       //원하는 메일 제목 작성
//	       String subject = "메일 발송 테스트";
//	       
//	       //****************건들지 마세요********************
//	       String fromEmail = "내 이메일 주소";
//	       String fromUsername = "내 이름";
//	       
//	       //받는 이메일 req.getParameter("email") : 사용자가 입력한 이메일로 대체
//	       String toEmail = "tedhan1204@gmail.com"; // 콤마(,)로 여러개 나열
//	       
//	     //****************건들지 마세요********************
//	       final String username = "구글 계정 이름";         
//	       final String password = "구글 계정 비밀번호";
//	       //*********************************************
//	       
//	       // 메일에 출력할 텍스트
//	       String html = null;
//	       StringBuffer sb = new StringBuffer();
//	       sb.append("<h3>안녕하세요</h3>\n");
//	       sb.append("<h4>테스트입니다.</h4>\n");    
//	       html = sb.toString();
//	       
//	       // 메일 옵션 설정
//	       Properties props = new Properties();    
//	       props.put("mail.smtp.starttls.enable", "true");
//	       props.put("mail.smtp.host", "smtp.gmail.com");
//	       props.put("mail.smtp.auth", "true");
//	       props.put("mail.smtp.port", "587");
//	       props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//	       props.put("mail.smtp.ssl.protocols", "TLSv1.2");
//	       
//	       try {
//	         // 메일 서버  인증 계정 설정
//	         Authenticator auth = new Authenticator() {
//	           protected PasswordAuthentication getPasswordAuthentication() {
//	             return new PasswordAuthentication(username, password);
//	           }
//	         };
//	         
//	         // 메일 세션 생성
//	         Session session = Session.getDefaultInstance(props, auth);
//	         
//	         // 메일 송/수신 옵션 설정
//	         Message message = new MimeMessage(session);
//	         message.setFrom(new InternetAddress(fromEmail, fromUsername));
//	         message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
//	         message.setSubject(subject);
//	         message.setSentDate(new Date());
//	         
////	         // 메일 콘텐츠 설정
//	         Multipart mParts = new MimeMultipart();
//	         MimeBodyPart mTextPart = new MimeBodyPart();
//	         MimeBodyPart mFilePart = null;
//	//    
////	         // 메일 콘텐츠 - 내용
//	         mTextPart.setText(html, bodyEncoding, "html");
//	         mParts.addBodyPart(mTextPart);
////	               
////	         // 메일 콘텐츠 설정
//	         message.setContent(mParts);
//	    
//	         // 메일 발송
//	         Transport.send( message );
//	         
//	       } catch ( Exception e ) {
//	         e.printStackTrace();
//	       }

	}
}
