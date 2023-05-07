import java.util.Scanner;

public class Ex06배열실습6666 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] answer = {1,4,3,2,1}; // 실제답
			int[] input = new int[5]; //사용자가 입력한 답 저장
			
			//답 입력
			for(int i = 0; i<input.length; i++) {
				input[i] = sc.nextInt();
				
			
			}
			int score = 0;//총점
			String check = "";
			//입력한 답과 실제답이 같으면 O 출력, 다르면 X 출력
			for(int i =0; i<input.length; i++) {
				if(answer[i] == input[i]) {
					System.out.print(" " + "O");
					check = check + "O";
					score +=20;
				}else {
					check +="x";
					
				}
			}
			System.out.println(check);
			System.out.println("총점 : " + score);
		}
}
