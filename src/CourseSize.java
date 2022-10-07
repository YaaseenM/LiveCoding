public class CourseSize {
    public static void main (String [] args) {
       Course course = new Course();
      
      // Example students for testing
      course.addStudent(new Student("Henry", "Bendel", 3.6));   
      course.addStudent(new Student("Johnny", "Min", 2.9)); 
       
      System.out.println("Course size: " + course.courseSize());
    } 
}