package 숫자게임만들기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlusGame game = new PlusGame();
				
		System.out.println("---- 사칙연산 게임 ----");
		
		while(true) {
			
		
			for(int i = 1 ; i<=5; i++) {
				System.out.print(i+" 라운드 : ");
				game.random();
			System.out.print(game.getQuizMsg());
			
			int result = sc.nextInt();
			
			
			if(game.checkAnswer(result)==false) {
				System.out.println("틀렸습니다");
			}else {
				System.out.println("정답입니다");
			}
		}
		}

//		ArrayList<Member> al = new ArrayList<Member>();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("닉네임 : ");
//		String Nickname = sc.nextLine();
//
//		System.out.print("비밀번호 : ");
//		String password = sc.nextLine();
//
//		Member m = new Member(Nickname, password);
//
//		al.add(m);
//		
//	
//		System.out.println(m.getame());
//		boolean login = false;
//
//		while (!login) {
//			System.out.print("닉네임: ");
//			String inputNickName = sc.nextLine();
//			System.out.print("비밀번호: ");
//			String inputPw = sc.nextLine();
//
//			for (int i = 0; i <= m.size(); i++) {
//				if (m.getname(i).equals(inputNickName) && m.getpassword().equals(inputPw)) {
//					System.out.println(m.getname() + "님 게임 난이도/종류를 선택해주세요!");
//					login = true;
//					break;
//				}
//			}
//
//			if (!login) {
//				System.out.println("로그인에 실패하셨습니다.");
//			}
//		}
//
//		System.out.println("[1]초급 [2]중급 [3]고급 [4]지옥");
//		int level = sc.nextInt();
//		sc.nextLine();
//
//		System.out.println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기");
//		int gametype = sc.nextInt();

	}

}
