package cesde.edu.co.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "programas")
@Data
public class Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programa_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigo;

    @Column(nullable = false)
    private String nombre;
}