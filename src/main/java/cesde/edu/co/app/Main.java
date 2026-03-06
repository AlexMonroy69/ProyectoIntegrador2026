package cesde.edu.co.app;

import cesde.edu.co.models.Persons;
import cesde.edu.co.models.Teacher;
import cesde.edu.co.models.Student;
import cesde.edu.co.models.Programs;
import cesde.edu.co.models.Subjects;
import cesde.edu.co.models.Groups;
import cesde.edu.co.models.Grades;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persons person = new Persons();
        Persons person2 = new Persons();
        Persons person3 = new Persons();

        person.setFirstName("Jose");
        person2.setFirstName("Maria");
        person3.setFirstName("Juan");

        Persons person4 = new Persons(1L, "001", "123456789", "Jose", "Perez", "vasquez@gmail.com", true);

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        Student student = new Student();
        student.setFirstName("Maria");
        student.setBirthDate("01/01/2000");
        System.out.println(student.toString());

        Teacher teacher = new Teacher();
        teacher.setFirstName("Juan");
        teacher.setProfession("Matematicas");
        System.out.println(teacher.toString());

        Student student2 = new Student(2L, "002", "987654321", "Maria", "Gomez");
        System.out.println(student2.toString());

        Teacher teacher2 = new Teacher(3L, "003", "456789123", "Juan", "Lopez");
        System.out.println(teacher2.toString());

        Programs program = new Programs();
        program.setId(1L);
        program.setCodigo("SOFT-01");
        program.setNombre("Desarrollo de Software");
        System.out.println(program.toString());

        Subjects subject = new Subjects();
        subject.setId(1L);
        subject.setNombre("Bases de Datos I");
        subject.setCreditos(4);
        subject.setPrograma(program);
        System.out.println(subject.toString());

        Groups group = new Groups();
        group.setId(1L);
        group.setCodigo("G1-SOFT-M");
        group.setPrograma(program);
        group.setShift("mañana");
        System.out.println(group.toString());

        Grades grade = new Grades();
        grade.setId(1L);
        grade.setFinalScore(4.8);
        grade.setObservacion("Excelente desempeño");
        grade.setEstudiante(student2);
        System.out.println(grade.toString());
    }
}