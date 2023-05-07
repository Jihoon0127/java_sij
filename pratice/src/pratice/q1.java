package pratice;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int target = sc.nextInt();
		int n = 1;
		
	 int week;
		
		while(now>target) {
			System.out.print(n+ "주차 감량 몸무게 : ");
			week = sc.nextInt();
			n++;
			now = now-week;
			
		}
			System.out.println(now + "kg 달성!! 축하합니다!");
	}

}
