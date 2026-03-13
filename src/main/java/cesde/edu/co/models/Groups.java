package cesde.edu.co.models;

public class Groups {
    private Long id;
    private String codigo;
    private Programs programa;
    private String shift;

    public Groups() {
    }

    public Groups(Long id, String codigo, Programs programa, String shift) {
        this.id = id;
        this.codigo = codigo;
        this.programa = programa;
        this.shift = shift;
    }

    // --- SETTERS Y GETTERS ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Programs getPrograma() {
        return programa;
    }

    public void setPrograma(Programs programa) {
        this.programa = programa;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}