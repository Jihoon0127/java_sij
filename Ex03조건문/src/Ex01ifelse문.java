import java.util.Scanner;

public class Ex01ifelse문 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("점심 총 금액 : ");
		int price = a.nextInt();
		System.out.print("사람 명 수 : ");
		int person= a.nextInt();
		
		if(price/person >10000) {
			System.out.println("10000원 이상 지불");
		}else {
			System.out.println("10000원 미만 지불");
		}

	}

}
