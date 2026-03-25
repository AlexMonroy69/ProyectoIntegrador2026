package Repository.impl;

import Repository.StudentRepository;
import cesde.edu.co.models.Student; // Importación necesaria
import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {
    private List<Student> students;
    private long nextStudentId;

    public StudentRepositoryInMemory() {
        this.students = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student create(Student student) {
        if (student == null || findByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }
        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public boolean delete(long studentId) {
        // Usamos getStudentId() para que coincida con la clase Student
        return students.removeIf(s -> s.getStudentId() != null && s.getStudentId() == studentId);
    }

    @Override
    public boolean update(Student studentUpdate) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentUpdate.getStudentId())) {
                students.set(i, studentUpdate);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findById(long studentId) {
        for (Student student : students) {
            if (student.getStudentId() != null && student.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean existsById(long studentId) {
        return findById(studentId);
    }

    @Override
    public boolean findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return false;
        }
        for (Student student : students) {
            if (documentNumber.equals(student.getDocumentNumber())) {
                return true;
            }
        }
        return false;
    }
}