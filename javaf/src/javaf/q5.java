package javaf;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("행 개수를 입력하세요: ");
		int row = a.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
