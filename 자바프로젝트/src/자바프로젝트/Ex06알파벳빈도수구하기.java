package 자바프로젝트;

import java.util.Scanner;

public class Ex06알파벳빈도수구하기 {

	public static void main(String[] args) {
		
		System.out.println("=== 알파벳 빈도수 구하기 ===");
		
		
		
		
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// a ~ z : 26개
		int[] alphabet = new int[26];
		// 알파벳 빈도수가 저장될 int[26] 배열을 하나 만들어주자
		
		// nextLine() : Enter를 칠때까지 문자열을 저장
		// next() : space를 칠때까지 문자열을 리턴
		System.out.print("입력 >> ");
		// Hello world
		// replace(" ","").toLowerCase();
		// helloworld
		// 문자열(s) ----> 문자(char):쪼개
		// charAt(index)---> 아스키코드(int)
		for(int i = 0; i<s.length(); i++) {
			char c =s.charAt(i);
			alphabet[c - 97]++; // 
		}
		// a: 97~ z:122
		//
		// a: 0인덱스에 값이 +1
		// b: 1인덱스에 값이 +1
		// s.length() 반복 횟수
		
		// char c= s.chatAt(0)
		
		// 출력하기 ~ 빈도수가 저장되어있는 배열 출력
		for(int i = 0; i<alphabet.length; i++)
			System.out.println((char)(i+97) +":" +alphabet[i]);
	}

}
