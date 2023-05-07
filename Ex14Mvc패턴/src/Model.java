
public class Model {
	//Music 설계도 작성
	
	//VO(Value Object) - 뮤직이라는 value를 지정하기위함
	
	//필드
	private String songName; 
	private String singer;
	private int playTime; //음악길이(s)
	private String musicPath; //음악파일경로

	//생성자
	public Model(String songName, String singer, int playTime, String musicPath) {
		// 매개인자로 넣어준 값으로 필드 초기화
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPath = musicPath;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	//getter, setter
	
}
