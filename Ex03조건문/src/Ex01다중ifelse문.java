import java.util.Scanner;

public class Ex01다중ifelse문 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = a.nextInt();

		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if (80 <= score && score < 90) {
			System.out.println("B학점입니다.");
		} else if (70 <= score && score < 80) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}

	}

}
