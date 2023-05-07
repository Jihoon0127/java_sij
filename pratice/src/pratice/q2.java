package pratice;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int money = 5000;
		double pay = 8*money + (time-8)* money*1.5;
		int all = (time >8 ?(int)pay : money * time);

		System.out.print("총 임금은 " + all + "원 입니다.");
	}

}
