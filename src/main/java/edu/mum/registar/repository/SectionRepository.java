package edu.mum.registar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.registar.domain.Section;
@Repository
public interface SectionRepository extends CrudRepository<Section,Long>{

}
