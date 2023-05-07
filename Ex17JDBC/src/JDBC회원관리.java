import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

   public static void main(String[] args) {
//      static Connection conn = null;
      // -> 이 클래스 안에서 getConn메서드를 사용하려면 객체 소환해야 함
      Scanner sc = new Scanner(System.in);
      // (1)로그인 (2)회원가입 (3)닉네임 조회 (4)종료
      //4번을 누르기 전까지 1,2,3, 메뉴를 계속 선택할 수 있도록 만들기!
      
      int menu;
      String inputId;
      String inputPw;
      String inputNick;
      
      UserDAO dao = new UserDAO();
      
      do {
      System.out.print("[1]로그인 [2]회원가입 [3]전체회원 조회 [4]종료 >> ");
      menu = sc.nextInt();
      
      
         if(menu == 1) {
            System.out.println("---로그인 시도---");
            // 사용자로부터 ID, PW 입력받아서 모두 DB에 있는 내용과 맞다면 
            // "'nick'님 환영합니다" 출력
            System.out.print("ID : ");
            inputId = sc.next(); 
            System.out.print("Pw : ");
            inputPw = sc.next(); 
            
            
            
             dao.login(inputId, inputPw);
            
         }
         
         else if(menu == 2) {
               System.out.println("---회원가입 시도---");
               // id, pw, nick를 사용자로부터 입력받아서 member테이블에 저장해주세요
               
               System.out.print("ID 입력 >> ");
               inputId = sc.next(); 
               System.out.print("Pw 입력 >> ");
               inputPw = sc.next(); 
               System.out.print("Nick 입력 >> ");
               inputNick = sc.next();
               
               Connection conn = null;
               PreparedStatement pstm = null;
//               ResultSet rs = null; -> 회원가입의 경우, 이 부분은 int로 나오니까 rs 필요 X

              
            int result=   dao.join(inputId, inputPw, inputNick);
            if(result>0) {
            	System.out.println("회원가입 성공!");
            }else {
            	System.out.println("회원가입 실패!");
            }
         }
         
         
         else if(menu == 3) {
            System.out.println("---전체회원 조회---");
            //ID: 승환, PW: 123, Nick:점심짜장저녁냉면
            //ID: 1, PW: 1, Nick:점심짜장저녁냉면
            //ID: 승환, PW: 123, Nick:점심짜장저녁냉면
           ArrayList<UserDTO> membersList =  dao.membersList();
            for(int i = 0; i<membersList.size(); i++) {
            	String id = membersList.get(i).id;
            	String pw membersList.get(i).pw;
            	String nick = membersList.get(i).nick;
            	System.out.println();
            	System.out.println("ID : " + id+"PW : " +pw +"NICK : " + nick);
            }
            
            // 연결해제
            dao.close();
            return membersList();
         }
               
      
      } while(menu != 4) ; // 4. 종료
      System.out.println("종료되었습니다.");
   
                  
      
      
   }
   
   // DB연결 메서드 getConn
//   Connection conn = null;
//   PreparedStatement pstm = null;
//   ResultSet rs = null;


}