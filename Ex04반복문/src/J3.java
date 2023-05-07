import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("행 개수를 입력하세요: ");
		int n = a.nextInt();

		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.print("\n");
			i += 1 ;

		}

	}
}

//  i j
//  1 1 / 1 2 / 1 3 / 1 4 / 1 5 / 2 1 / 2 2