package 도서관리프로그램;

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		System.out.println("===도서 관리 시스템 ===");
		Scanner sc = new Scanner(System.in);
		BookSystem bookManager = new BookSystem();
		while(true) {
			System.out.println("[1]등록 [2]전체조회 [3]종료");
			int choice = sc.nextInt();
			
			if(choice ==1) {
				System.out.println("책 이름 : ");
				String title = sc.next();
				System.out.println("책 가격 : ");
				int price = sc.nextInt();
				System.out.println("책 저자 :");
				String writer = sc.next();
				bookManager.addBook(title, price, writer);
			}else if (choice ==2) {
				String msg = bookManager.getBookTitleList();
				System.out.println();
			}else if(choice ==3) {
				
			}else
				System.out.println("올바른 숫자를 입력하세요.");
		}
	}

}
