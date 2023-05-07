import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random rd = new Random();
		int rn = rd.nextInt(100) + 1;

		System.out.println("======1부터 100 사이 숫자 맞추기 게임! ======");

		while (true) {
			System.out.print("숫자를 입력하세요: ");
			int num = a.nextInt();
			if (num > rn) {
				System.out.println("더 작은 수로 다시 시도해 보세요.");
			} else if (num < rn) {
				System.out.println("더 큰 수로 다시 시도해 보세요.");
			} else {
				System.out.println("정답입니다!");
				break;
			}
		}

	}

}
