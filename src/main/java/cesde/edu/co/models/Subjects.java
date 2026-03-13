package cesde.edu.co.models;

public class Subjects {
    private Long id;
    private String codigo;
    private String nombre;
    private Integer creditos;
    private Programs programa;

    public Subjects() {
    }

    public Subjects(Long id, String codigo, String nombre, Integer creditos, Programs programa) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.programa = programa;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Programs getPrograma() {
        return programa;
    }

    public void setPrograma(Programs programa) {
        this.programa = programa;
    }
}