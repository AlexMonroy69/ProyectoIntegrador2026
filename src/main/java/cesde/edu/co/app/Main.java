package cesde.edu.co.app;

import cesde.edu.co.models.Student;
import cesde.edu.co.models.Teacher;
import Repository.impl.StudentRepositoryInMemory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepositoryInMemory repository = new StudentRepositoryInMemory();

        Student student1 = new Student(
                1L, 101L, "S001", "12345678",
                "Juan", "Perez", "juan@mail.com",
                true, "2005-05-15"
        );

        Student student2 = new Student(
                2L, 102L, "S002", "87654321",
                "Maria", "Gomez", "maria@mail.com",
                true, "2006-08-20"
        );

        System.out.println("--- Creando Estudiantes ---");
        repository.create(student1);
        repository.create(student2);

        System.out.println("--- Listado de Estudiantes ---");
        List<Student> allStudents = repository.findAll();
        for (Student s : allStudents) {
            System.out.println(s.toString());
            System.out.println("Rol: " + s.getRole());
        }

        System.out.println("\n--- Probando Búsqueda ---");
        boolean exists = repository.existsById(101L);
        System.out.println("¿Existe el usuario 101?: " + (exists ? "Sí" : "No"));

        System.out.println("\n--- Ejemplo de Profesor ---");
        Teacher teacher1 = new Teacher(
                201L, "T001", "55667788",
                "Carlos", "Rodriguez", "carlos@cesde.edu.co",
                true, "Desarrollo de Software"
        );
        System.out.println(teacher1.toString());
        System.out.println("Rol del docente: " + teacher1.getRole());

        System.out.println("\n--- Probando Eliminación ---");
        boolean deleted = repository.delete(2L);
        System.out.println("¿Se eliminó el estudiante con ID 2?: " + (deleted ? "Sí" : "No"));
        System.out.println("Total estudiantes actual: " + repository.findAll().size());
    }
}