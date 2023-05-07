package pratice;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i = 0; i<num ;i++ ) {
		sum += i;
			System.out.print(sum+" ");
		}
		}
		
}
