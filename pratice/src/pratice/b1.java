package pratice;

import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		System.out.print("A 입력 : ");
		int a = sc.nextInt();
		System.out.print("B 입력 : ");
		int b = sc.nextInt();
		int result = a -b;
		
		System.out.println("결과 : " + result);
		if( result ==0) {
			break;
		}
	
	}

	}

}
