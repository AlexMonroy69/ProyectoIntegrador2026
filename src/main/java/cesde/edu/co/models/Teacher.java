package cesde.edu.co.models;

public class Teacher extends Persons {
    private String specialization;

    public Teacher() {
        super();
    }

    public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName, String email, Boolean status, String specialization) {
        super(userId, code, documentNumber, firstName, lastName, email, status);
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "TEACHER";
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String toString() {
        return "Teacher { " + super.toString() + ", specialization='" + specialization + "' }";
    }
}