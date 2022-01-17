package InstagramOOP;

public class ContentCreatorUser extends User{
	
	private String firstName;
	private String lastName;
	
	public ContentCreatorUser(int id, String username, String email, String password, String profilePicture,
			String description, String firstName, String lastName) {
		super(id, username, email, password, profilePicture, description);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ContentCreatorUser(int id, String username, String email, String password, String profilePicture,
			String description) {
		super(id, username, email, password, profilePicture, description);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
