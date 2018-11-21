package edu.mum.registar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.registar.domain.Semester;
@Repository
public interface SemesterRepository extends CrudRepository<Semester,Long>{

}
