import java.util.ArrayList;

public class DeanList{
	public static void main(String args[]) {
	   Course course = new Course();
      ArrayList<Student> deanList = new ArrayList<Student>();
      
      // Example students for testing
      course.addStudent(new Student("Henry", "Nguyen", 3.5));   
      course.addStudent(new Student("Brenda", "Stern", 2.0)); 
      course.addStudent(new Student("Lynda", "Robison", 3.2)); 
      course.addStudent(new Student("Sonya", "King", 3.9)); 
		
		deanList = course.getDeansList();
		System.out.println("Dean's list:");
		for (Student student: deanList) {
			System.out.println(student);
		}
	}    
}