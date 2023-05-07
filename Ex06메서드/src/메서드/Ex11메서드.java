package 메서드;

public class Ex11메서드 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}
	//public(공공의) : 접근제한자
	// : 클래스내/외부에서 접근할 수 있도록 해주는 제한자
	// 2. static(정적인) : 저장소
	// 3. 리턴타입: ㅁ서드가 돌려주는 결과값의 데이터 타입
	// 있(자료형) : return / 없(void) : return x --> 기능자체
	// 4. 메서드명(호출명)
	// 5. (매개변수) : 모든 메서드들은 소괄호가 붙는다. print도 메서드
	// 소괄호 안쪽에 매개변수(메서드안에서 사용되는 변수, main에서 받아온 전달인자) 작성
	// + 전달인자, 매개변수는 개수, 자료형이 같아야한다
public static boolean isDivide(int a, int b) {
	if(a%b ==0 ) {
		return true;
	}
		else {
		return false;
		}
	}
	

}
