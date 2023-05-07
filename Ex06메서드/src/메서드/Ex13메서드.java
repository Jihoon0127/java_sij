package 메서드;

public class Ex13메서드 {

	public static void main(String[] args) {
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	public static int powerN(int base, int n) {
		int sum = 1;
		for(int i = 0 ; i<n; i++) {
			sum *= base;
	
		
			
		}
		return sum;
	}
}
