import java.util.Scanner;

public class Ex01if문2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("JAVA 점수 입력 : ");
		int java = a.nextInt();
		System.out.print("Python 점수 입력 : ");
		int python = a.nextInt();
		System.out.print("Android 점수 입력 : ");
		int android = a.nextInt();
		
		if((java+python+android)/3 >80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
