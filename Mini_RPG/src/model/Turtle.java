package model;

public class Turtle extends Monster implements Defensible{

	public Turtle(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defence() {
		System.out.println("거북이 방어 ");		
	}
	
	

	@Override
	public void attack() {
		System.out.println("거북이 공격");
		
	}

	@Override
	public void printInfo() {
		System.out.println("거북이 정보");
		
	}
}
