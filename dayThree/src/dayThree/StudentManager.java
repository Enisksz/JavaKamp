package dayThree;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getStudentNumber()+" numaral� " + student.getFirstName() + " " +student.getLastName()+ " eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getStudentNumber()+" numaral� " + student.getFirstName() + " " +student.getLastName()+ " silindi");
	}

}
