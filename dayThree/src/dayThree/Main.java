package dayThree;

public class Main {

	public static void main(String[] args) {
		
		//Student section
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ahmet");
		student1.setLastName("Ballı");
		student1.setEmail("ahmet@gmail.com");
		student1.setStudentNumber(27);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ayşe");
		student2.setLastName("Tez");
		student2.setEmail("ayşe@gmail.com");
		student2.setStudentNumber(49);
		
		Student student3 = new Student(3,"Ali","Demir","aliD@gmail.com",35);
		
		
		
		
		Student[] students = {student1,student2};
		
		StudentManager studentManager = new StudentManager();
		
		for (Student student : students) {
			studentManager.add(student);
			
		}
		
		studentManager.delete(student3);
		
		System.out.println("------------------------------------------------------------");
		
		//Instructor section
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(4);
		instructor1.setFirstName("Necip");
		instructor1.setLastName("Sönmez");
		instructor1.setEmail("necip@gmail.com");
		instructor1.setDescription("abc okulundan mezun oldum");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(5);
		instructor2.setFirstName("Hülya");
		instructor2.setLastName("Feyza");
		instructor2.setEmail("hulyaf@gmail.com");
		instructor2.setDescription("fhd okulundan mezun oldum. Uzun süredir eğitmenlik yapıyorum");
		
		Instructor[] instructors = {instructor1,instructor2};
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
		}
		
		instructorManager.sendHomework(instructor2);
	}

}
