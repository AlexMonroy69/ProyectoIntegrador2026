package cesde.edu.co.models;

public class Student extends Persons {
    private Long studentId;
    protected String birthDate;

    public Student() {
        super();
    }

    public Student(Long studentId, Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
        this.studentId = studentId;
        this.birthDate = birthDate;
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    @Override
    public String toString() {
        return "Student { studentId=" + studentId + ", " + super.toString() + ", birthDate='" + birthDate + "' }";
    }
}