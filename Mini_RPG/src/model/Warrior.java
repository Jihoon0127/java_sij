package model;

public class Warrior extends Character  implements Defensible {

	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
	
	}
	@Override
	public void defence() {
		System.out.println("전사 방어");
		
	}
	@Override
	public void itemUse() {
		System.out.println("전사 아이템 사용");
		
	}
	@Override
	public void itemUnUse() {
		System.out.println("전사 아이템 해제");
		
	}
	@Override
	public void attack() {
		System.out.println("전사 공격");
	}
	@Override
	public void printInfo() {
		System.out.println("전사 정보");
		
	}

}
