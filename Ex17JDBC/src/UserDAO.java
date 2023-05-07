import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

   // DAO : Data Access Object == 데이터에 접근하는 기능
   // 통로 연결 & 쿼리문실행 & 연결 끊기
   
   Connection conn = null;
   PreparedStatement pstm = null;
   ResultSet rs = null;
   
   
   // 1. DB연결
   public void getConn() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); 
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String id = "service";
         String pw = "12345";
      
         conn = DriverManager.getConnection(url, id, pw); 
         
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      } 
   }
   
   
   // 2. DB 연결 제거
   public void close() {
      
      try {
         if(rs != null) {
            rs.close();
         }
         if(pstm != null) {
            pstm.close();
         }
         if(conn != null) {
            conn.close();
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
         }
      }      
   
   
   // 3. 로그인 기능
   public void login(String inputId, String inputPw) {
      
      getConn();
      
      try {
//         String sql = "select * from member where id='"+inputId+"' and pw='"+inputPw+"'";
         String sql = "select nick from member where id = ? and pw = ?";
         
         pstm = conn.prepareStatement(sql); 
         pstm.setString(1, inputId);
         pstm.setString(2, inputPw);
         
         rs = pstm.executeQuery(); // -> 얘는 맨 처음 위치의 정보값이 담김
         // 데이터를 계속해서 찾아가기 위해 rs.next()가 필요.
         
         if(rs.next()) { 
//            if(inputId.equals(rs.getString("id")) && inputPw.equals(rs.getString("pw")));
            String nick = rs.getString("nick");
            System.out.println(nick + "님 환영합니다!");
         }
         
      } catch (SQLException e) {
         System.out.println("쿼리문 오류");
         e.printStackTrace();
      }
      
      close();
   }
   
   
   // 4. 회원가입 기능
   public void join(String inputId, String inputPw, String inputNick) {
      
      getConn();
      int result= 0;
      try {
         String sql = "insert into member values(?,?,?)";
         pstm = conn.prepareStatement(sql);
         // connection 객체를 통해 prepareStatement를 사용해야하는데 conn이 null값이래ㅠ
         pstm.setString(1, inputId);
         pstm.setString(2, inputPw);
         pstm.setString(3, inputNick);
         
        result = pstm.executeUpdate();
         
         
      } catch (SQLException e) {
         System.out.println("쿼리문 오류");
         e.printStackTrace();
      } 
      
      close();
      return result;
   }

   
   // 5. 닉네임 조회
   public ArrayList<UserDTO> membersList() {
   
      getConn();
      ArrayList<UserDTO> membersList = new ArrayList<>();
      try {
         String sql = "select * from member";
         pstm = conn.prepareStatement(sql);
         rs = pstm.executeQuery();
         
//         int i = 0; // 회원 수 
//         while(rs.next()) { 
//            System.out.print(i + ". " + rs.getString("id")+" : " + rs.getString("nick") +  " : " + rs.getString("nick")+"\n");
//            i++;
            
//                     }
         
         while(rs.next()) {
        	 String id = rs.getString(1);
        	 String pw = rs.getString(2);
        	 String nick = rs.getString(3);
        	 
        	 UserDTO dto = new UserDTO(id, pw, nick);
        	 membersList.add(dto);
        	 
         }
      } catch (SQLException e) {
         System.out.println("쿼리문 오류");
         e.printStackTrace();
      } 
      
      close();
      
   }

}