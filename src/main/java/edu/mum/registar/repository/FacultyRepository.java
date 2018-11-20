package edu.mum.registar.repository;

import edu.mum.registar.domain.Faculty;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Long> {

    @Query("select e from Faculty e where e.email=:email")
    Faculty findFacultyByEmail(@Param("email") String email);
}
