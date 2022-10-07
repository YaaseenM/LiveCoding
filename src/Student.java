public class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String _lastName, double gpa) {
        this.firstName = firstName;
        lastName = _lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}
