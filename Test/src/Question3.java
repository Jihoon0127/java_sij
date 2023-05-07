import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("나이 >> ");
		int old = a.nextInt();

		if (old <= 40) {
			System.out.println("초년입니다.");
		} else if (old >= 41 && old <= 60) {
			System.out.println("중년입니다.");

		} else
			System.out.println("노년입니다.");
	}

	}


