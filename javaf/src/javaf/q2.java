package javaf;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	      System.out.print("일한 시간을 입력 하세요 : ");
	      int time = a.nextInt();
	      int money = 5000;
	      double pay = time * money *1.5;
	      
	      int bb = (time > 8 ? (int)pay : time*money ); 
	      System.out.println("총 임금은 " + bb +"입니다.");

	}

}
