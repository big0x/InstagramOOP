package InstagramOOP;

import java.sql.Date;

public class ImagePost extends Post{

	private int id;
	private String image;
	public ImagePost(int id, String username, String description, String comments, int likeCount, Date createDate) {
		super(id, username, description, comments, likeCount, createDate);
	}
	public ImagePost(int id, String username, String description, String comments, int likeCount, Date createDate,
			int id2, String image) {
		super(id, username, description, comments, likeCount, createDate);
		id = id2;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}

