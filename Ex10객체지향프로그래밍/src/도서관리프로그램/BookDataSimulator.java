package 도서관리프로그램;
//책을 표현하는 클래스(책 정보를 가지고 있음)
public class BookDataSimulator {
	
	private String title;
	private int price;
	private String writer;
	
	// 생성자
public BookDataSimulator(String title,
		int price, String writer) {
	super(); //상속?
	this.title= title;
	this.price = price;
	this.writer = writer;
}
// getter
public String gettitle() {
	return this.title;
}
public int getprice() {
	return this.price;
}
public String getwriter() {
	return this.writer;
}
//public static void price() {
//	
//}



	
}

