package pratice;

import java.util.Scanner;

public class ㅂ5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("행 개수 : ");
	int row = sc.nextInt();
		for(int i =1; i<=row;i++) {
			for(int j = 1; i>=j; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		
	}

}
