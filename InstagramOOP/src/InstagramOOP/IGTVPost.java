package InstagramOOP;

import java.sql.Date;

public class IGTVPost extends Post{

	private int id;
	private String igtvVideo;
	public IGTVPost(int id, String username, String description, String comments, int likeCount, Date createDate,
			int id2, String igtvVideo) {
		super(id, username, description, comments, likeCount, createDate);
		id = id2;
		this.igtvVideo = igtvVideo;
	}
	public IGTVPost(int id, String username, String description, String comments, int likeCount, Date createDate) {
		super(id, username, description, comments, likeCount, createDate);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIgtvVideo() {
		return igtvVideo;
	}
	public void setIgtvVideo(String igtvVideo) {
		this.igtvVideo = igtvVideo;
	}
	
}
