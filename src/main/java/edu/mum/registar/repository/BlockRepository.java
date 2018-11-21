package edu.mum.registar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.registar.domain.Block;

@Repository
public interface BlockRepository extends CrudRepository<Block,Long>{

}
