package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

		// s~e 완전수

		// main 안쪽

		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란 ?
		// : 자기자신을 제외한 약수의 합이 자기자신과 같은 수
		// 6 : 1 2 3 --> 6 (완전수)
		// 10 : 1 2 5 -->> (완전수가 아님)
		// 28 : 1 2 4 7 14 --> 28 (완전수)
		// true, false
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		// true/false
	}
	// 매개변수 2개 (int), 출력 하는 기

	// main 밖
	// 1. isDivisor() : 매개변수 int 2개, 리턴타입 boolean(true,false)
	public static boolean isDivisor(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
		// is라는 키워드가 붙은 메서드는 결과값이(리턴타입이) boolean
	}

	// 2. getDivisor() : 출력하는 기능을 가지고 있다(void), 매개변수 int 1개
	public static void getDivisor(int c) {
		System.out.print(c + "의 약수 : ");
		for (int i = 1; i <= c; i++) {
			if (isDivisor(c, i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

//3. getSumOfDivisors()
	public static int getSumOfDivisors(int d) {
		// num1의 약수들의 합
		int sum = 0; // 약수들의 합이 들어갈 공간

		// 1. 약수인지 아닌지 판단
		for (int i = 1; i <= d; i++) {
			if (isDivisor(d, i)) {
				sum += i;
			}
			// 2. 누적
		}
		return sum;
	}

// 4. isPerfectNumber() : 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {

		// num3가 완전수인지 아닌지?
		// 자기자신을 제외한 약수의 합 == 자기 자신
		// 약수의 합 = 자기자신 * 2
		if (getSumOfDivisors(num3) - num3 == num3) {
			return true;
		} else {
			return false;
		}

	}

// 5. 
	public static void getPerfectNumber(int num4, int num5) {
		
		// 2라는 숫자가 완전수인지 아닌지 판단 --true-- 출력
		System.out.print(num4+"과"+num5+"사이의 완전수 : ");
		for(int i =num4; i <=num5; i++) {
		if(isPerfectNumber(i) = true) {
			System.out.print(i+ " ");
				}
		
					
	
		}
	
	}
}

