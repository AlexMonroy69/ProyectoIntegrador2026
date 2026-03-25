package cesde.edu.co.repository;

import cesde.edu.co.models.Teacher;
import java.util.List;

public interface TeacherRepository {

    Teacher create(Teacher teacher);

    boolean delete(long teacherId);

    boolean update(Teacher teacherUpdate);

    Teacher findById(long id);

    List<Teacher> findAll();

    boolean existsByDocumentNumber(String documentNumber);

    Teacher findByDocumentNumber(String documentNumber);
}