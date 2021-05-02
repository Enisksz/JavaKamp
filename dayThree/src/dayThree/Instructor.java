package dayThree;

public class Instructor extends User {
	private String description;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName, email);
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);

	}

	public String getDescription() {
		return description;
	}
	


	public void setDescription(String description) {
		this.description = description;
	}

	

}
