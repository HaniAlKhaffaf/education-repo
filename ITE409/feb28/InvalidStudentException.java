package feb28;

public class InvalidStudentException extends RuntimeException {
    private int id;
    public InvalidStudentException(int i) {
        super();
        this.id = i;
    }
    @Override
    public String getMessage() {
        return "Student ID: " + id;
    }
}
