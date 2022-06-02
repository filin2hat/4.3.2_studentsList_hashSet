import java.util.Objects;

public class Student {

    private final String name;
    private final String group;
    private final String studentId;

    public Student(String fullName, String group, String studentId) {
        this.name = fullName;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, group, studentId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
