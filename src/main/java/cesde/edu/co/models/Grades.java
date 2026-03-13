package cesde.edu.co.models;

public class Grades {
    private Long id;
    private Double finalScore;
    private String observacion;
    private Student estudiante;

    public Grades() {
    }

    public Grades(Long id, Double finalScore, String observacion, Student estudiante) {
        this.id = id;
        this.finalScore = finalScore;
        this.observacion = observacion;
        this.estudiante = estudiante;
    }

    // --- SETTERS Y GETTERS ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }
}