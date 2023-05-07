import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		  Scanner a = new Scanner(System.in);
	      System.out.print("현재 몸무게 : ");
	      int now = a.nextInt();
	      System.out.print("목표 몸무게 : ");
	      int target = a.nextInt();
	      
	      int f_weihgt = now - target; 
	      int lost = 0;
	      int n = 0;
	      
	      while(now>target) {
	         n++;
	         System.out.print(n + "주차 감량 몸무게 : " );
	         lost = a.nextInt();
	         now -=lost;
	         System.out.println("현재 몸무게 : " + now);
	            }
	      
	         System.out.println("최종 몸무게 :" + now );
	         System.out.println("축하합니다!!!");
	      
	   }
	}
