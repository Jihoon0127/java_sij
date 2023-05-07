package 입출력;

public class Ex01출력 {

	public static void main(String[] args) {
		
		//System : 표준 입출력 클래스
		//System.out : 출력 기능 사용
		
		int a = 10;
		//a -> 변수, 상수(값은 저장)
		
		//print() -> 메서드(기능)
		//~~ 를 출력하겠다 기능
		System.out.print(123);
		System.out.print("Hello World!\n"); //\n : 개행
		
		//println() : 출력후 개행
		System.out.println("출력구문1");
		System.out.println("출력구문2");
		System.out.println("출력구문3");
		
		//printf() : 특정 형식으로 출력
		//1. pi  = 3.14
		int a1 = 2;
		String b ="pi";
		double c = 3.14;
		
		//%d : 정수자리 %s : 문자열자리 %f : 실수자리
		System.out.printf("%d. %s = %f\n", a1, b, c);
		System.out.printf("%d. %s = %f", a1, "pi", c);
		
		String s1 = "제 이름은 ";
		String s2 = "신지훈입니다";
		
		System.out.print(s1);
		System.out.print(s2);
		
		System.out.print(s1+s2+1); //문자열은 연산(+)
	}

}
