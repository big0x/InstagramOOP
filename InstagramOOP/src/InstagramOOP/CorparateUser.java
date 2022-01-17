package InstagramOOP;

public class CorparateUser extends User{
	
	private String companyName;

	public CorparateUser(int id, String username, String email, String password, String profilePicture,
			String description, String companyName) {
		super(id, username, email, password, profilePicture, description);
		this.companyName = companyName;
	}

	public CorparateUser(int id, String username, String email, String password, String profilePicture,
			String description) {
		super(id, username, email, password, profilePicture, description);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
