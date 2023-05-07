import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = a.nextInt();
		
		int b = num/10;
		int c = num%10;
		
		System.out.println(b);
		System.out.println(c);


	}

}
