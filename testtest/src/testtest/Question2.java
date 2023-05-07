package testtest;

public class Question2 {

	public static void main(String[] args) {

		Question1TV t = new Question1TV();
		t.channel = 7;
		t.color = "red";
		t.print(); // 현재 tv상태의 출력
		t.channelUp();
		t.channelUp();
		t.print();
		t.color = "black";
		t.channelDown();
		t.print();
	}

}
