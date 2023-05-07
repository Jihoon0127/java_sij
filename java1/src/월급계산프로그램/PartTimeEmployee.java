package 월급계산프로그램;

public class PartTimeEmployee extends Employee {

//	String empno;
//	String name;
//	int pay;
	int workDay;
	
	// 생성자
	

//	public PartTimeEmployee(String empno,String name,int pay,int workDay) {
//			this.empno = empno;
//			this.name = name;
//			this.pay = pay;
//			this.workDay = workDay;
//	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return pay* workDay;
	}

	public PartTimeEmployee(String empno, String name, int pay,int workDay) {
		super(empno, name, pay); // ---> 부모 클래스의 생성자를 지칭하는 키워드
		this.workDay = workDay;
	}
	
	//getMoneyPay (리턴타입 : int)
	
//	public int getMoneyPay() {
//		return pay*workDay;
//	}
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}
//	
	}
	

