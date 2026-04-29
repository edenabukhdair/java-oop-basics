import java.util.Arrays;

public class classroom {
    private String[] students;

    public void setStudents(String[] students) {
        this.students = students;
    }
    public String[] getStudents() {
        return students;
    }

    public String toString() {
        return "students = " + Arrays.toString(students);
    }

}
