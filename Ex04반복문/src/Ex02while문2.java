import java.util.Scanner;

public class Ex02while문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int input = 0;
		int odd = 0;
		int even = 0;
			while(true) {
			
			input = sc.nextInt();
			 if(-1 == input) {
				 break;		
			}
			 if(input%2 ==1) {//홀수
				 odd++;
				 System.out.println("홀수");
			 }else { //짝수
				 ++even;
				 System.out.println("짝수");
			 }
			 num += input;
		}
		System.out.println("누적결과 : " + num);

	}

}
