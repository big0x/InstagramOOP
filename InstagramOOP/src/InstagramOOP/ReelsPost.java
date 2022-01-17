package InstagramOOP;

import java.sql.Date;

public class ReelsPost extends Post{

	private int id;
	private String reelsVideo;
	public ReelsPost(int id, String username, String description, String comments, int likeCount, Date createDate,
			int id2, String reelsVideo) {
		super(id, username, description, comments, likeCount, createDate);
		id = id2;
		this.reelsVideo = reelsVideo;
	}
	public ReelsPost(int id, String username, String description, String comments, int likeCount, Date createDate) {
		super(id, username, description, comments, likeCount, createDate);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReelsVideo() {
		return reelsVideo;
	}
	public void setReelsVideo(String reelsVideo) {
		this.reelsVideo = reelsVideo;
	}
}

