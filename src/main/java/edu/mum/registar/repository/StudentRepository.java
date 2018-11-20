package edu.mum.registar.repository;

import edu.mum.registar.domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email = :email")
    Student findStudentByEmail(@Param("email") String email);

<<<<<<< HEAD

=======
    @Query("SELECT s FROM Student s where s.adviser = :faculty_id")
    List<Student> findStudentsByFacultyId(@Param("faculty_id") String faculty_id);
>>>>>>> 16716e000d1db76c2b4d2f3c62b3dd466a3b4e3e
}
