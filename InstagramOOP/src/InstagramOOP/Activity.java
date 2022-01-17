package InstagramOOP;

public class Activity {
	
	private int id;
	private String profilePicture;
	private String username;
	private String[] followRequest;
	
	public Activity(int id, String profilePicture, String username, String[] followRequest) {
		super();
		this.id = id;
		this.profilePicture = profilePicture;
		this.username = username;
		this.followRequest = followRequest;
	}

	public Activity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String[] getFollowRequest() {
		return followRequest;
	}

	public void setFollowRequest(String[] followRequest) {
		this.followRequest = followRequest;
	}
	
	
}
