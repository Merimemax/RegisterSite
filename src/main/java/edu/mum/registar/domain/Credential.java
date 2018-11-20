package edu.mum.registar.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @NotEmpty(message = "User Name can be empty")
    private String userName;

    @NotEmpty(message = "Password can be empty")
    private String password;

    private Role role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
