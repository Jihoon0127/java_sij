import java.util.Scanner;

public class LoginView {
	Scanner sc = new Scanner(System.in);

public void showlogin() {
	String id;
	String pw;
	System.out.println("========로그인=======");
	System.out.println("아이디 : ");
	id = sc.next();
	System.out.println("비밀번호 : ");
	pw = sc.next();
	
	if(id.equals(????) && pw.equals(???)) {
		System.out.println("로그인에 성공하였습니다.");
	}else {
		System.out.println("로그인에 실패하였습니다.");
	}
	
}
	
	System.out.println("=======회원가입=======");
	System.out.print("아이디를 입력하세요 : ");

	id = sc.next();
	System.out.print("패스워드를 입력하세요 : ");
	pw = sc.next();
	System.out.print("닉네임을 입력하세요 : ");
	nick = sc.next();
	System.out.println("회원가입이 완료되었습니다.");
}
