package 도서관리프로그램;

import java.awt.print.Book;
import java.util.ArrayList;

// 사용자와 상호소통하는 인터페이스 역할
public class BookSystem {
	
	private ArrayList<Book> list = new ArrayList<>();
	
	//책 등록 기능
public void addBook(String title, int price, String writen) {
	Book book = new Book(title,price,writer);
	list.add(book);
}

// 책 전체 조회
public String getBookTitleList() {
	String msg = "";
			for(int i = 0; i< list.size(); i++) {
				Book temp = list.get(i); // 책을 한권씩 꺼내는 코드
				msg += temp.getTitle(); //책 이름을 누적
				msg += "\n";
			}
			return msg;
}
}
