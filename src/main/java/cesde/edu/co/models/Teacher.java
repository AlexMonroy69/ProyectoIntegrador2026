package cesde.edu.co.models;

public class Teacher extends Persons {
    private String profession;

    public Teacher() {
        super();
    }

    public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName) {
        super(userId, code, documentNumber, firstName, lastName);
    }

    // --- SETTERS Y GETTERS ---

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}