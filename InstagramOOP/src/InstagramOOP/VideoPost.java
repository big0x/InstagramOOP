package InstagramOOP;

import java.sql.Date;

public class VideoPost extends Post{

	private int id;
	private String video;
	public VideoPost(int id, String username, String description, String comments, int likeCount, Date createDate,
			int id2, String video) {
		super(id, username, description, comments, likeCount, createDate);
		id = id2;
		this.video = video;
	}
	public VideoPost(int id, String username, String description, String comments, int likeCount, Date createDate) {
		super(id, username, description, comments, likeCount, createDate);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
