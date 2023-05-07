package 도서관리프로그램;

public class BookData {
	public static void main(String[] args) {
		//객체 생성
		BookDataSimulator book = new BookDataSimulator("책",100,"황해도");

				
		System.out.println(book.gettitle());
		System.out.println(book.getprice());
		System.out.println(book.getwriter());
	}
}

