package 자바프로젝트;

import java.util.Scanner;

public class Ex03이진수변환 {

	public static void main(String[] args) {
		
		// 입력하는 도구 가져오기
		Scanner a= new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = a.nextInt();
		// 2진수를 저장할 수 있는 배열 : 10
		int[] arr = new int[10];
		
		int i = 0;
		while(num >= 2) {
			
			// num을 2로 나누기
			num = num/2;
			// num을 2로 나눠서 나온 나머지값을 배열에 저장
			// index
			arr[i] = num%2;
			i++;
		}
		
		arr[i] = num;
		
		// arr이라는 배열에 i번째 인덱스까지 값이 들어가 있는 상태
		// 출력
		// + index어디까지 값이 저장되어 있는지 변수
		for(int j = i; j>=0; j--) {
			System.out.println(arr[j] + " ");
		}
		
		
		// 2진수를 구해서 배열에 저장
		
		// 출력

	}

}
