package javaf;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = a.nextInt();
		
		for(int i =row; i>=1; i--) {
			for(int j = 1; i>=j ; j++) {
			System.out.print("* ");
	}
			System.out.println();
		}
	}
}
