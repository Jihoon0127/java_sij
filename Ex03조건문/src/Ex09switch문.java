import java.util.Scanner;

public class Ex09switch문 {

	public static void main(String[] args) {
		
//		int num =20;
//		
//		switch(num) {
//		case 20:
//			System.out.println(20);
//			break;
//		case 30:
//			System.out.println(30);
//			break;
//			default:
//				System.out.println("다른 수");
//		}

		Scanner a = new Scanner(System.in);
		System.out.println("입력: ");
		String hi = a.next();
		
		

		switch(hi) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본어":
			System.out.println("곤니찌와");
			break;
			default:
			System.out.println("다른값 입력");
		}
	}
}

