import java.util.Scanner;

public class Birds {

	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		System.out.print("첫번쨰 정수 입력 : ");
//		int num = a.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = a.nextInt();
//		
//		
//		System.out.println("두 수의 차 : " + ((num<num2) ? num2-num  : num-num2 ));
//		

//		Scanner a = new Scanner(System.in);
//		System.out.print("농구공의 개수를 입력하세요 : ");
//		int ball = a.nextInt();
//		
//		int box =(ball%5 == 0)? ball/5 : ball/5+1;
//		System.out.println("필요한 상자의 수 : " + box);
////		
//		

		Scanner b = new Scanner(System.in);
		System.out.println("노동시간을 입력하세요 : ");
		double time = b.nextInt();
		
		int money = 9000;
		double pay = (time >= 8) ? money * 1.5 * time : time * money;
		System.out.println("총 임금은 " + (int)pay + "원 입니다.");

	}

}
