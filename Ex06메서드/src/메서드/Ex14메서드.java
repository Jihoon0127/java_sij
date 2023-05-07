package 메서드;

import java.util.stream.IntStream;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}
	public static String getMiddle(String a) {
		int length = a.length();
		int len = a.length()/2;
		
		if(length % 2 == 0) {
			// 짝수
			// test --->es
		return "" +a.charAt(len-1)+ a.charAt(len+1);
	}else {
		// 홀수
		//abcde
		//"" + int/char : 뒤에있는 데이터타입이 자동으로 String 변환됨
		return "" + a.charAt(len);
	}
		
		// index ----> 0 
		// String ---> char[] ---->0
}
}
