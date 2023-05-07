package 주소록관리프로그램;

public class Address {

	private String name;
	private int age;
	private int phoneNumber;

	public Address (String name, int age, int phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
