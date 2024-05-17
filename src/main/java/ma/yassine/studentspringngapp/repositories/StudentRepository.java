package ma.yassine.studentspringngapp.repositories;

import ma.yassine.studentspringngapp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> findStudentByProgramId(String programId);
    Optional<Student> findStudentByCode(String code);
}

