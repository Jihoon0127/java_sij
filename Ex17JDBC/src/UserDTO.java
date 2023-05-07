
public class UserDTO {

	//DTO -> Data Transfer Object
	
	//MVC 패턴
	//M : model(VO) --> 데이터가 보여지는 형식
	//V : View --> 사용자에게 보여지는 전부분
	//C : Controller --> 사용자에게 보여지지는 않지만 기능상 데이터를 다루는 부분
	
	String id;
	String pw;
	String nick;
	public UserDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	
}
