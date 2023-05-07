import java.util.Scanner;

public class Ex06배열실습66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] answer = {1,4,3,2,1};
		int[] answers = new int[5];
		
        System.out.println("==채점하기==");
        for(int i = 0; i < answer.length; i++) {
            System.out.print((i+1) + "번째 답 입력: ");
            answer[i] = sc.nextInt();
        }
        int score = 0;
        System.out.print("정답 확인 : ");
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == answers[i]) {
        	System.out.print(" "+ "O");
        	score +=20;
            }else { 
        	System.out.print(" " + "X");
        	}
        }
    }
	}








	


