package edu.mum.registar.service.impl.credentialServiceImpl;

import edu.mum.registar.domain.Credential;
import edu.mum.registar.repository.CredentialRepository;
import edu.mum.registar.service.credentialService.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CredentialServiceImpl implements CredentialService {

    @Autowired
    CredentialRepository credentialRepository;

    @Override
    public void saveCredential(Credential credential) {
        credentialRepository.save(credential);
    }

    @Override
    public Credential getCredentialByEmail(String email) {
        return credentialRepository.findCredentialByCredentialEmail(email);
    }
}
