package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(max = 20)
    @Column(name = "login")
    private String login;

    @NotNull
    @Size(max = 50)
    @Column(name = "password")
    private String password;

    @NotNull
    @Size(min = 11, max = 11)
    @Column(name = "cpf")
    private long cpf;

    public User() {

    }

    public User(String name, String login, String password, long cpf) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", login=" + login + ", CPF=" + cpf + "]";
    }
}
