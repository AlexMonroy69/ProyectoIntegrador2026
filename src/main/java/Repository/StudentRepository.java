package Repository;

import cesde.edu.co.models.Student;
import java.util.List;

public interface StudentRepository {
    Student create(Student student);
    boolean delete(long studentId);
    boolean update(Student studentUpdate);
    boolean findById(long studentId);
    boolean findByDocumentNumber(String documentNumber);
    List<Student> findAll();
    boolean existsById(long studentId);
}