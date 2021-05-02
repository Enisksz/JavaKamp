package dayThree;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen eklendi");
	}

	public void sendHomework(Instructor instructor) {
		System.out.println("Eðitmen " + instructor.getFirstName() + " ödev gönderdiniz");
	}
}
