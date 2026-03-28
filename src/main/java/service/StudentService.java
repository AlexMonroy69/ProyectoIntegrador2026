package co.edu.cesde.service;

import co.edu.cesde.models.Student;
import co.edu.cesde.repository.StudentRepository;

import java.util.List;

public interface StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        if (isInvalidStudent(student) || studentRepository.existsByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }
        return studentRepository.create(student);
    }
}