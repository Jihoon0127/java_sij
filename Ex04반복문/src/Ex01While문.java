
public class Ex01While문 {

	public static void main(String[] args) {

		// 반복문
		// 1.while (do~while) : 특정 조건에 해당할 경우에만 반복 {반복횟수가 정확하지 않은 경우)
		// 2.for : 반복횟수가 정해진 경우
		//while ({문장}을 반복할 조건)
//		int num = 1;
//		while (num < 6) {
//			num++;
//			System.out.println(num); //변수
//		}
		//지역변수 : 특정 구역에서만 사용가능한 값(어디까지만 사용가능한지)
		//전역변수 : 어디에서든 사용가능한 값
		int num1 = 1;
		while (true) {
			
			if(num1) {
				
				break; //switch, 반복문,(while,for)을 나가게 하는 키워드
						// -> break를 기준으로 가장 가까운 반복문만 나감
				
			//num1++;
		}
			 //변수
			System.out.println(num1++);
//	int num2 = 0;
//	while (TRUE) { 
//		System.out.println(num2++);
//		//num1++;
//		//반복문을 나갈 조건 추가
	} //do~while문
		int num3 = 1;
		do {
			System.out.println(num3);
		}while();
}
}

