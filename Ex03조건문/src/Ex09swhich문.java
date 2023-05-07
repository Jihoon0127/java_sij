import java.util.Scanner;

public class Ex09swhich문 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("월(1~12) 입력 : ");
		int season = a.nextInt();
		
		
		switch(season) {
		case 1 : case 2 : case 12:
			System.out.println("겨울");
			break;
		case 3 : case 4: case 5:
			System.out.println("봄");
			break;
		case 6:case 7: case 8 :
			System.out.println("여름");
			break;
		case 9: case 10:case 11 :
			System.out.println("가을");
			break;
		}

	}

	
		
		
}
