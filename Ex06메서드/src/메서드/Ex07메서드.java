package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = LargerNumber(num1,num2);
		System.out.println("큰 수 확인 :" + result);

	}
	public static int LargerNumber(int a, int b) {
		
		if(a>b) {
			 // System.out.println(a);
			return a;
		}else {
			 // System.out.println(b);
			return b;
		}
		
	}

}
