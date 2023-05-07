import java.util.Arrays;
import java.util.Scanner;

public class Ex04비정방형배열생성1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];

		
		for(int i = 1; i< arr.length; i++) {
		System.out.println(i+ "반 점수 입력");
		}
		for (int j = 0 ; j < arr.length; j++) {
		System.out.print(i + "반 " + j + "번째 학생점수 >> ");
		}

			for (int i = 0 ; i < arr.length; i++) {
				for (int j = 0 ; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
					
					
				}
//				for(i =1; i <arr.length; i++ ) {
//					System.out.println();
//				}
						
				
				for (i = 1; i < arr.length; i++) {
					System.out.print(i + "반 >>" + Arrays.toString(arr[i]));
					for (int j = 1; j < arr.length; j++) {
						System.out.print(arr[i][j]);
						int a = sc.nextInt();
					}
			}

		}
	}
}
