package collection;

public class Music {
	private String title;
	private String singer;
	@Override
	public String toString() {
		return title + " (" + singer +")";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	
}
