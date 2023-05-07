import java.util.Scanner;

public class ddd {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("넣을 금액 : ");
		int price = a.nextInt();

		System.out.println("--메뉴-- 1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		int menu = a.nextInt();

		int coke = 1800;
		int power = 2000;
		int water1 = 1200;

		switch (menu) {
		case 1:
			price -= coke;
			break;
		case 2:
			price -= power;
			break;
		case 3:
			price -= water1;
			break;
		}
		if (price >= 0) {
			System.out.printf("잔돈 : %d원\n" + "천원 : %d\n" + "오백원 : %d\n" + "백원 : %d\n", price, price / 1000,
					price % 1000 / 500, price % 1000 % 500 / 100);
		}else {
			System.out.println("돈이 부족해요 ㅠㅡㅠ");
		}
	}
}
