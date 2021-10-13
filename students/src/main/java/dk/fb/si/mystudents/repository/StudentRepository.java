package dk.fb.si.mystudents.repository;

import dk.fb.si.mystudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    // Notice, there are no methods here,
    // but we can still use all those inherited from JpaRepository.
}
