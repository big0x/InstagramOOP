package InstagramOOP;

import java.sql.Date;

public class Post {

	private int id;
	private String username;
	private String description;
	private String comments;
	private int likeCount;
	private Date createDate;
	
	public Post(int id, String username, String description, String comments, int likeCount,
			Date createDate) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.comments = comments;
		this.likeCount = likeCount;
		this.createDate = createDate;
	}
	public Post() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
