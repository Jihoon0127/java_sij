import java.util.Scanner;

public class Ex01ifelse문2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("소프트웨어 설계 : ");
		int test1 = a.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int test2 = a.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int test3 = a.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int test4 = a.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int test5 = a.nextInt();
		
		int test = test1+test2+test3+test4+test5;
		if(test>=60 && (test1 >7 && test2 >7 && test3>7 && test4 >7&& test5 >7)) {
			System.out.println("합격입니다.");
		}else  {
			System.out.println("불합격입니다.");
		}
	}
	
}
