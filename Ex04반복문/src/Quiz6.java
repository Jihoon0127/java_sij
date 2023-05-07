import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		String yes = "Y";
		String no = "N";

		String yes1 = "";
		String no1 = "";
		while (true) {
			System.out.println("정수1 : ");
			int num1 = a.nextInt();
			System.out.println("정수2 : ");
			int num2 = a.nextInt();
			System.out.println("연산자(+/-) : ");
			String pm = a.next();

			int result = num1 + num2;
			int result2 = num1 - num2;

			if (pm.equals("+")) {
				System.out.println(num1 + pm + num2 + "=" + result);
				System.out.println("계속하시겠습니까?");
				yes1 = a.next();

			} else {
				System.out.println(num1 + pm + num2 + "=" + result2);
				System.out.println("계속하시겠습니까?");
				no1 = a.next();

			}
			if (yes1.equals("N")) {
				System.out.println("종료");
				break;
			}
			if (no1.equals("N")) {
				System.out.println("종료");
				break;
			} else {
				continue;
			}
		}

	}

}
