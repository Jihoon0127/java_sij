package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
	
		//	Charac c1 = new Charac();
		// 추상클래스는 객체 생성이 불가능
		
		Wizard harry = new Wizard();
		harry.atk();
		harry.run();
		harry.jump();
		
		// 전사(Warrior)
		// 공격 ----> 스윽
		// 점프 ----> 점프
		// 전진 ---> 뚜벅뚜벅
		Warrior w1 = new Warrior();
		Warrior.run();
		Warrior.jump();
		Warrior.atk();

	}

}
