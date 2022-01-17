package InstagramOOP;

public class Story {

	private int id;
	private int userId;
	private String image;
	private String video;
	
	public Story(int id, int userId, String image, String video) {
		super();
		this.id = id;
		this.userId = userId;
		this.image = image;
		this.video = video;
	}
	public Story() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
