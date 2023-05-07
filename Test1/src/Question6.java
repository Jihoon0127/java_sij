import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = a.nextInt();
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num = num/ 10;
		}
		System.out.println("각 자리수의 합: " + sum);


	}

}
