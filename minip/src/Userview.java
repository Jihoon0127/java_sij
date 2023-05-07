import java.util.ArrayList;
import java.util.Scanner;

public class Userview {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//ArrayList<UserDao_Dummy> userInfo = ArrayList<UserDao_Dummy>();  
		
		System.out.println("영화 제목 맞추기 게임!");
		System.out.println("[1]회원가입 [2]로그인 [3]종료]");
		int menu = sc.nextInt();
		
		if(menu ==1) {
			System.out.println("=======회원가입=======");
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			System.out.print("패스워드를 입력하세요 : ");
			String pw = sc.next();
			System.out.print("닉네임을 입력하세요 : ");
			String nick = sc.next();
			System.out.println("회원가입이 완료되었습니다.");
			
			
//		}else if(menu ==2){
//			String id;
//			String pw;
//			System.out.println("========로그인=======");
//			System.out.println("아이디 : ");
//			id = sc.next();
//			System.out.println("비밀번호 : ");
//			pw = sc.next();
//			
//			if(id.equals(????) && pw.equals(???)) {
//				System.out.println("로그인에 성공하였습니다.");
//				System.out.println("[1]명대사 듣고 영화제목 맞추기 [2]OST듣고 영화제목 맞추기");		
//				int select = sc.nextInt();
//					if(select ==1) {
//						System.out.print();
//					}else if (select ==2) {
//						
//					}else {
//						System.out.println("옳은 번호를 선택하세요.");
//					}
//				
//			}else {
//				System.out.println("로그인에 실패하였습니다.");
//			}
//			
//		}else {
//			
//			break;
//		}
//		System.out.println();
	}
	
	}
}
