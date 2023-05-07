package testtest;

public class Question1TV {
	int channel;
	String color;

	public void print() {
		System.out.println("TV의 현재 채널은 : " + channel + "이고,");
		System.out.println("TV의 색깔은 " + color + "입니다.");
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

}
