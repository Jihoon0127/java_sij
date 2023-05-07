package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,5,7};
		//int[] arr = {10,24,7,68,42,82,3,43};
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		int temp; //치환을 위한 임시공간
		boolean sw = false;
		//1회차
//		// 0-1 / 1-2 / 2-3 / 3-4 / 4-5 / 5-6 / 6-7
//		for(int i =0 ; i<arr.length -1; i++ ) {
//			if(arr[i]>arr[i+1]) {
//					temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//			
//		}
//		System.out.println(1 + "회차 : " + Arrays.toString(arr));
//		//2회차
//		// 0-1 / 1-2 / 2-3 / 3-4 / 4-5 / 5-6 
//		for(int i =1; i<arr.length-2;i++) {
//			if(arr[i]>arr[i+1]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(2+ "회차 : " + Arrays.toString(arr));
		// 중간에 정렬이 완료된 경우 더이상 정렬을 진행하지 않는 코드 작성
		 //n회차 정렬이 한번이라도 일어나면 true
		for(int j =0; j<arr.length -1; j++) { //7회차
			// 0-1 / 1-2 / 2-3 / 3-4 / 4-5 / 5-6 
			sw = false; 
			for(int i =0; i<arr.length-1-j;i++) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sw = true;
				}
			}
		
			if(!sw) { //sw가 false 일때만 수행 (n회차 한번도 바뀌지 않았을 때)
				break;
				
			}
						
				
			
			System.out.println(j+1+ "회차 : " + Arrays.toString(arr));
		}
	}
}

