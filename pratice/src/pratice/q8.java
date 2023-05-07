package pratice;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int num1 = num%10;
		
		
		if(num1>=5) {
			System.out.println(num-num1 +10);  
		}else {
			 System.out.println(num-num1); 

	}
		
}
}
