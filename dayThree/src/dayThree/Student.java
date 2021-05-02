package dayThree;

public class Student extends User{
	private int studentNumber;
	
	public Student() {
	}
	
	public Student(int id,String firstName,String lastName,String email,int studentNumber) {
		super(id, firstName, lastName, email);
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.studentNumber=studentNumber;
	}
	
	
	public int getStudentNumber() {
		return studentNumber;
	}



	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}



	
}
