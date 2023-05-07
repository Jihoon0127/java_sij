import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("plus game");
		
		int answer;
		int count = 0;
		String yes;

		while (true) {
			num1 = rd.nextInt(50) + 1;
			num2 = rd.nextInt(50) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			answer = sc.nextInt();
			if (answer == (num1 + num2)) {
				System.out.println("Success");
				
			} else {
				System.out.println("Fail");
				count++;
				if (count == 3) {
					
					break;
				}
				
					System.out.println("계속 하시겠습니까? >> ");
					yes = sc.next();

					if (yes.equals("N")) {
						System.out.println("종료합니다.");
					break;
					}

			}
			
		}
	}
}

