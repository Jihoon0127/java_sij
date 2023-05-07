package 큐;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println();
			System.out.println("현재 데이터 개수 : %d / %d\n, s.size(), s.getCapacity()");
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");
			
			int menu =sc.nextInt();
			if(menu ==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
			x = sc.nextInt();
			
			case 2:
				x = s.deque();
				System.out.println("디큐한 데이터는 " + x + "입니다.");
			}
		}

	}

}
