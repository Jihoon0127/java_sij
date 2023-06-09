import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 선언
		int array[];
		//2. 크기가 10인 배열 생성 후 참조값을 변수에 저장
		array = new int[10];  //생성된 배열의 참조값을 array에 넣겠다
		//3. 0~9 인덱스에 값 초기화
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		//도구 -> 객체(인스턴스)
		//toString(객체가 가지고 있는 공통 기능)
		// : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		// Arrays 도구(객체)가 가지고 있는 toString 메서드 호출
		//toString 반환타입 ? String
		System.out.println(Arrays.toString(array));
		
		//5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
		System.out.println(array[1] + array[4]);
		
		//6. 각 인덱스에 저장된 모든 값을 더하여 출력
		//누적합
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
			
		}
		System.out.println(sum);
		
		//7. 배열안에 있는 수의 평균 구하여 출력
		System.out.println(sum/array.length);
	}

}
