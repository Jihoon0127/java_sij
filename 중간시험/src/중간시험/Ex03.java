package 중간시험;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();

		if(age >= 61) {
			System.out.println("노년입니다.");
		}else if (age >= 41) {
			System.out.println("중년입니다.");
		}else {
			System.out.println("초년입니다.");
		}
	}

}
