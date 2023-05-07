import java.util.Scanner;

public class ex03다중ifelse문3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("잔액 : ");
		int price = a.nextInt();
		System.out.println("성인/청소년/어린이 : ");
		String person = a.next();

		if (price >= 1800 && person.equals("성인")) {
			System.out.println("감사합니다");
		} else if (price >= 1500 && person.equals("청소년")) {
			System.out.println("반갑습니다");
		} else if (price >= 1000 && person.equals("어린이")) {
			System.out.println("안녕하세요");
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}

}
