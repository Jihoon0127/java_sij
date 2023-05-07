import java.util.Scanner;

public class Ex07배열실습77 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String[] idArr = new String[3];
	        String[] pwArr = new String[3];
	        int userCount = 0;
	        boolean isLogin = false;
	        
	        while(true) {
	            System.out.println("1.회원가입 2.로그인 3.종료");
	            int menu = sc.nextInt();
	            
	            if(menu == 1) { // 회원가입
	                if(userCount == 3) {
	                    System.out.println("회원가입은 최대 3명까지 가능합니다.");
	                    continue;
	                }
	                System.out.println("===회원가입===");
	                System.out.print("id 입력 : ");
	                String id = sc.next();
	                System.out.print("pw 입력 : ");
	                String pw = sc.next();
	                
	                idArr[userCount] = id;
	                pwArr[userCount] = pw;
	                userCount++;
	                System.out.println("가입 성공");
	            } else if(menu == 2) { // 로그인
	                System.out.println("===로그인===");
	                System.out.print("id 입력 : ");
	                String id = sc.next();
	                System.out.print("pw 입력 : ");
	                String pw = sc.next();
	                
	                for(int i = 0; i < userCount; i++) {
	                    if(id.equals(idArr[i]) && pw.equals(pwArr[i])) {
	                        System.out.println("로그인 성공!");
	                        isLogin = true;
	                        break;
	                    }
	                }
	                if(!isLogin) {
	                    System.out.println("로그인 실패..");
	                }
	            } else if(menu == 3) { // 종료
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            } else { // 잘못된 입력 처리
	                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	            }
	        }


	}

}
