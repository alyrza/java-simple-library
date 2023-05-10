package library;

public class User {
    private String name;
    private int studentId;

    public User(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getters and setters for the private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
