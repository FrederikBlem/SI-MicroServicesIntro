package dk.fb.si.mystudentsassignmentservice.repository;

import dk.fb.si.mystudentsassignmentservice.controller.AssignmentController;
import dk.fb.si.mystudentsassignmentservice.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>
{
    // Notice, there are no methods here,
    // but we can still use all those inherited from JpaRepository.
}