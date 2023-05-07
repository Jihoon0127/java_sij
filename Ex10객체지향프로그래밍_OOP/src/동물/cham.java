package 동물;

public class cham extends Bird{

	// 추상메서드/클래스의 특징
	// 설계되어있는 추상메서드의 구현을 강제화
	// 동물이라면 당연하게 가지고 있어야되는 기능을 개발자가
	// 잊어버리지 않도록 강제화
	
	public void cry() {
		System.out.println("으악");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("먹");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}
