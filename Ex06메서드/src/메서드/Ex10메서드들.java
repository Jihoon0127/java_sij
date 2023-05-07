package 메서드;

public class Ex10메서드들 {

	public static void main(String[] args) {
		
		// String 관련덴 method 모음
		// indexOf()
		// 특정 문자열/특정 문자의 위치를 반환
		String data = "여러분 안녕?";
		// "안" 
		data.indexOf("녕"); // 리턴타입 : int
		System.out.println(data.indexOf("ㅇ"));
		// 포함하고 있지 않은 단어를 입력하면 -1 출력
		
		// contains(String s)
		// 매개변수로 받은 문자열의 포함 여부를 boolean으로 반환
		if(data.contains("안녕?") == true) {
			System.out.println("포함하고 있습니다!");
		}
		
		// charAt(int i)
		// String data에서 i번째 문자를 반환
		
		System.out.println(data.charAt(2));
		
		// split(String s)
		// : String 변수를 s 변수기준으로 잘라 배열로 반환
		String data2 = "010-2764-0296";
		String[] arr = data2.split("-");
		// 0: 010
		// 1: 2764
		// 2: 0296
		System.out.println(arr[1]);
		
		
		

	}

}
