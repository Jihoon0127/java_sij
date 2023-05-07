import java.util.Scanner;

public class Ex01if문 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = a.nextInt();

		if (num%3 ==0 || num%5 ==0) {
			System.out.println("3 또는 5의 배수 입니다.");

		}
		
		
		
	}

}
