package edu.mum.registar.repository;

import edu.mum.registar.domain.Credential;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialRepository extends CrudRepository<Credential, Long> {

    @Query("SELECT c FROM Credential c where c.userName = :email")
    Credential findCredentialByCredentialEmail(@Param("email") String email);
}
