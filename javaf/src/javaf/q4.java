package javaf;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
	      System.out.print("총 금액 입력 : ");
	      int money = a.nextInt();
	      
	      int money1 = money;
	      int money10000 = money/10000;
	      money %= 10000;
	      
	      int money5000 = money/5000;
	      money %= 5000;
	      
	      int money1000 = money/1000;
	      money %= 1000;
	      
	      int money500 = money/500;
	      money %= 500;
	      
	      int money100 = money/100;
	      money %=100;
	      
	      System.out.println("잔돈 : " + money1 + "원");
	      System.out.println("10000원 지폐 : " + money10000 + "개");
	      System.out.println("5000원 지폐 : " + money5000 + "개");
	      System.out.println("1000원 지폐 : " + money1000 + "개");
	      System.out.println("500원 지폐 : " + money500 + "개");
	      System.out.println("100원 지폐 : " + money100 + "개");


	}

}
