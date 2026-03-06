package cesde.edu.co.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "asignaturas")
@Data
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asignatura_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigo;

    private String nombre;
    private Integer creditos;

    @ManyToOne
    @JoinColumn(name = "programa_id")
    private Programs programa;
}