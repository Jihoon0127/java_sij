import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

//		arr[0] =rd.nextInt(20)+1;
//		arr[0] = rd.nextInt(20)+1; 
//		arr[1] = rd.nextInt(20)+1; 
//		arr[2] = rd.nextInt(20)+1; 
//		arr[3] = rd.nextInt(20)+1; 
//		arr[4] = rd.nextInt(20)+1; 
//		arr[5] = rd.nextInt(20)+1; 
//		arr[6] = rd.nextInt(20)+1; 
//		arr[7] = rd.nextInt(20)+1; 
//		arr[8] = rd.nextInt(20)+1; 
//		arr[9] = rd.nextInt(20)+1; 

//		int max= arr[0];
//		int min= arr[0];
//		
//		//배열 초기화
//		for(int i =1; i <arr.length; i++) {
//			if(arr[i]> max) {
//				max = arr[i];
//			}
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//			
//		}
//		System.out.println("가장 큰 값 : " + max );
//		System.out.println("가장 작은 값 : " + min);
//
//	}
//
//}
