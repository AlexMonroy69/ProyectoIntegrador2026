package cesde.edu.co.app;

import cesde.edu.co.models.Persons;
import cesde.edu.co.models.Teacher;
import cesde.edu.co.models.Student;
import cesde.edu.co.models.Programs;
import cesde.edu.co.models.Subjects;
import cesde.edu.co.models.Groups;

public class Main {
    public static void main(String[] args) {

        Persons person1 = new Persons();
        person1.setFirstName("Jose");

        Persons person2 = new Persons();
        person2.setFirstName("Maria");

        Persons person4 = new Persons(1L, "001", "123456789", "Jose", "Perez", "vasquez@gmail.com", true);

        System.out.println("PERSONAS:");
        System.out.println("Nombre Persona 1: " + person1.getFirstName());
        System.out.println("Detalles Persona 4: " + person4.getFirstName() + " " + person4.getLastName() + " - " + person4.getEmail());

        Student student1 = new Student();
        student1.setFirstName("Maria");
        student1.setBirthDate("01/01/2000");

        Student student2 = new Student(2L, "002", "987654321", "Maria", "Gomez");

        System.out.println("ESTUDIANTES:");
        System.out.println("Estudiante 1: " + student1.getFirstName() + " | Fecha Nacimiento: " + student1.getBirthDate());
        System.out.println("Estudiante 2: " + student2.getFirstName() + " " + student2.getLastName());

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Juan");
        teacher1.setProfession("Matematicas");

        Teacher teacher2 = new Teacher(3L, "003", "456789123", "Juan", "Lopez");

        System.out.println("DOCENTES:");
        System.out.println("Profesor 1: " + teacher1.getFirstName() + " | Profesión: " + teacher1.getProfession());
        System.out.println("Profesor 2: " + teacher2.getFirstName() + " " + teacher2.getLastName());

        Programs program = new Programs(1L, "SOFT-01", "Desarrollo de Software");

        System.out.println("PROGRAMA ACADÉMICO:");
        System.out.println("Nombre: " + program.getNombre() + " | Código: " + program.getCodigo());

        Subjects subject = new Subjects(1L, "DB-I", "Bases de Datos I", 4, program);

        System.out.println("ASIGNATURA:");
        System.out.println("Nombre: " + subject.getNombre() + " | Créditos: " + subject.getCreditos());
        System.out.println("Pertenece al programa: " + subject.getPrograma().getNombre());

        Groups group = new Groups();
        group.setCodigo("G1-SOFT-M");
        group.setPrograma(program);
        group.setShift("Mañana");

        System.out.println("GRUPO:");
        System.out.println("Código Grupo: " + group.getCodigo() + " | Jornada: " + group.getShift());
    }
}