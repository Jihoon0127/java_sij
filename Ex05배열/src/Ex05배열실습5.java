import java.util.Scanner;

public class Ex05배열실습5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrStr = {"김지은", "박수현", "정세연", "이명훈", "강예진","임명진", "정형", "채수민"};
		
		System.out.print("검색할 이름 입력 >> ");
		String input = sc.next();
		System.out.println(input);
		for(int i = 0 ; i<arrStr.length; i++) {
						if (arrStr[i].equals(input)) {
				System.out.print(input +" 님은 " + i + "번째 인덱스에 저장되어 있습니다");
			}
			
		}
		
	}



}
