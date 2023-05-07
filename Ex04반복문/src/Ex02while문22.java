import java.util.Scanner;

public class Ex02while문22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;

		do {
			System.out.println("숫자 입력 : ");
			input=sc.nextInt();
						sum += input;
		}while(input>0);
		
		System.out.println("누적 결과 : "+ sum);
	}

}
