package dayThree;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e�itmen eklendi");
	}

	public void sendHomework(Instructor instructor) {
		System.out.println("E�itmen " + instructor.getFirstName() + " �dev g�nderdiniz");
	}
}
