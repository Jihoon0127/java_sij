import java.util.Scanner;

public class dddddddd {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("초 입력 :");
		int time = a.nextInt();
			
		int hour = time/(60*60);
        int minute = time%(60*60)/60;
        int second = time%60;
        
        System.out.println(hour + "시" + minute + "분" + second + "초");
      
        
	}

}
