package 월급계산프로그램;

import java.util.Scanner;

public class RegularEmployee extends Employee {
	Scanner sc = new Scanner(System.in);

//	String empno;
//	String name;
//	int pay;
	int bonus;
	
	
	//생성자
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}

	// getMoneyPay (리턴타입 : int)
//	public int getMoneyPay() {
//		return (pay +bonus) / 12;
//	}

	// print(리턴타입 : String)
	// 사변 : 이름 : 연봉
	public String print() {
		return empno + " : " + name + " : " + pay;

	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return (pay+bonus)/12;
	}

}
