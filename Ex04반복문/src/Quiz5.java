import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	      String r_id = "smhrd";
	      String no = "N";
	      int count = 0;

	      while (count < 3) {
	         System.out.print("아이디 : ");
	         String id = a.next();
	         System.out.print("비밀번호 : ");
	         int password = a.nextInt();

	         if (id.equals(r_id) && password == 1234) {
	            System.out.println("로그인 성공");
	            break;
	         } else {
	            count++;
	            if (count == 3) {
	               System.out.println("본인인증을 해주세요.");
	               break;
	            }
	            System.out.println("로그인 실패");
	            System.out.println("계속 하시겠습니까?");
	            String next = a.next();
	            if (next.equals(no)) {

	               break;
	            }
	         }
	      }
	   }
	}

	


