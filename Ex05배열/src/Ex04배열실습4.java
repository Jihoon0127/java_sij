import java.util.Arrays;
import java.util.Scanner;

public class Ex04배열실습4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "번째 입력: ");
            arr[i] = a.nextInt();
            sum += arr[i];
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg =  sum / arr.length;

        System.out.print("입력한 점수: ");
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("최고점수: " + max);
        System.out.println("최저점수: " + min);
        System.out.println("총 합: " + sum);
        System.out.println("평균: " + avg);
	    }
	}
	

	
	


