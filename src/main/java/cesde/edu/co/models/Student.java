package cesde.edu.co.models;

public class Student extends Persons {
    private String birthDate;

    public Student() {
        super();
    }

    public Student(Long userId, String code, String documentNumber, String firstName, String lastName) {
        super(userId, code, documentNumber, firstName, lastName);
    }

    // --- SETTERS Y GETTERS ---

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}