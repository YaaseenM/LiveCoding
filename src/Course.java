import java.util.ArrayList;

public class Course {
    private ArrayList<Student> roster;

    public Course() {
        roster = new ArrayList<>();
    }
    public void addStudent(Student student) {
        roster.add(student);
    }
    public int courseSize() {
        return roster.size();
    }
    public ArrayList<Student> getStudents() {
        return roster;
    }
    public ArrayList<Student> getDeansList() {
        ArrayList<Student> deanList = new ArrayList<>();
        for (Student student : roster) {
            if (student.getGpa() >= 3.5) {
                deanList.add(student);
            }
        }
        return deanList;
    }
}
