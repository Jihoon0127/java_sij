import java.util.Scanner;

public class Ex06배열실습7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int count = 0;
		
		
		
		String id = "";
		String pw = "";
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int menu = sc.nextInt();
			if(menu ==1 ) {
				if (count < 3) {
					System.out.println("===회원가입===");
					System.out.print("id 입력 : ");
					id = sc.next();
					System.out.print("pw 입력 : ");
					pw = sc.next();
					
					
					count++;
					System.out.println("가입 성공");
				} else {
					System.out.println("회원수가 3명 초과");
				}
				
			}else if(menu == 2){
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				id = sc.next();
				System.out.print("pw 입력 : ");
				pw = sc.next();
				
				for(int i= 0 ; i<=id_array.length; i++) {
					if(id_array[i].equals(id) && pw_array[i].equals(pw)) {
						System.out.println("성공");
					}else {
							System.out.println("실패");
						}
						
					}
					
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
	}
			
}
}
