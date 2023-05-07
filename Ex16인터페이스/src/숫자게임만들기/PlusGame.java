package 숫자게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame {
	// 개발자 1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기

	Random rd = new Random();
	int num1 = 0;
	int num2 = 0;

	@Override
	public int random() {
		// 랜덤한 수를 하나 생성해서 리턴

		Random rd = new Random();
		num1 = rd.nextInt(10) + 1;
		num2 = rd.nextInt(10) + 1;
		return num1 + num2;
	}

	@Override
	public String getQuizMsg() {
		num1 = random();
		num2 = random();

		return num1 + "+" + num2 + " ="; // 문제를 출제
	}

	@Override
	public boolean checkAnswer(int ans) {

		if (num1 + num2 == ans) {
			return true;
		} else {
			return false;
		}
	}

	// 개발자1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기
}
