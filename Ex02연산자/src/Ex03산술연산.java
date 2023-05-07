import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
			System.out.print("JAVA 점수 입력 : ");
			int java = a.nextInt();
			System.out.print("WEB 점수 입력 : ");
			int web = a.nextInt();
			System.out.print("ANDROID 점수 입력 : ");
			int android = a.nextInt();
			
			double sum = java + web + android;
			double sum2 = sum/3;
			System.out.println("합계 : " + (int)sum);
			System.out.printf("평균 :  " + "%.2f", sum2);
		
			
			
	}

}
