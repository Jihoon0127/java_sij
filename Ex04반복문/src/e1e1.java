import java.util.Scanner;

public class e1e1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int now = a.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = a.nextInt();
		int week = 1;
		while(true) {
			System.out.println(week + "주차 감량 몸무게 : ");
			int minus = a.nextInt();
			week++;
			now -= minus;
			if(now <= goal) {
				break;
			}
			System.out.println("최종몸무게 : ");
			System.out.println("축하합니다!");
			
		}
	
	}}
		
		
		
		
		
		
		
		
	


