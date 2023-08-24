package 뮤직플레이어;

public class MusicPlayer {
	private String singer;
	private String title;
	private int year;
	private int time;
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public MusicPlayer(String singer, String title, int year, int time) {
		super(); // 나중에 배우장
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
	}
	public MusicPlayer(String singer, String title, int year, int time, String path) {
		super(); // 나중에 배우장
		this.singer = singer;
		this.title = title;
		this.year = year;
		this.time = time;
		this.path = path;
	}
	
	
	
	

	
	

}
