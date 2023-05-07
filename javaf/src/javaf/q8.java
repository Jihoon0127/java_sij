package javaf;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("A 입력 : ");
			int input = a.nextInt();
			System.out.print("B 입력 : ");
			int input1 = a.nextInt();
			int result = input-input1;	
			
			System.out.println("결과 >> " + result);
						
			if(result == 0) {
				
				break;
			}
		
		}

	}

}
