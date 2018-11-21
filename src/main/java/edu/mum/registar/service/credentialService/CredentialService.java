package edu.mum.registar.service.credentialService;

import edu.mum.registar.domain.Credential;

public interface CredentialService {

    public void saveCredential(Credential credential);

    public Credential getCredentialByEmail(String email);
}
