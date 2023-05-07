package 월급계산프로그램;

public class TempEmployee extends Employee{

//	String empno;
//	String name;
//	int pay;

	//생성자
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
		}
	// getMoneyPay(리턴타입 : int)--- 월급
	public int getMoneyPay() {
		return pay/12;
	}
	//print (리턴타입 : String)
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//
//	}

}
