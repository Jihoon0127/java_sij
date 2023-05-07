package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank {
	Scanner sc= new Scanner(System.in);
	
int deposit;
int withdraw;
int showMoney;
int money ;
int sum =0;
int withdraw1;


public PiggyBank() {
	System.out.println("돼지저금통 생성!");
}

public void deposit(){
	System.out.print("입금할 금액 입력 : ");
	int deposit1 = sc.nextInt();
	sum += deposit1;
}
public void withdraw() {
	
	System.out.print("출금할 금액 입력 : " );
	int withdraw1 = sc.nextInt();
	
	sum -= withdraw1;
}
public void showMoney() {
	System.out.println(sum);
}
}
