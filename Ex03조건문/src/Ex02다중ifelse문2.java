import java.util.Scanner;

public class Ex02다중ifelse문2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("A,B,C중 하나 입력 : ");
		String alpha = a.next();

		if (alpha.equals("A")) {
			System.out.println("A입력");
		} else if (alpha.equals("B")) {
			System.out.println("B입력");
		} else if (alpha.equals("C")) {
		    System.out.println("C입력");
		} else {
			System.out.println("A,B,C중에 입력해주세요.");
		}
	}

}
