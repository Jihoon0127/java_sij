import java.util.Scanner;

public class SignupView {
	Scanner sc = new Scanner(System.in);


public void signup() {
	System.out.println("=======회원가입=======");
	System.out.print("아이디를 입력하세요 : ");
	String id = sc.next();
	System.out.print("패스워드를 입력하세요 : ");
	String pw = sc.next();
	System.out.print("닉네임을 입력하세요 : ");
	String nick = sc.next();
	System.out.println("회원가입이 완료되었습니다.");
	
}
}