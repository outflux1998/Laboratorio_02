package com.puc.laboratorio2.model;

import javax.management.InvalidAttributeValueException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    public User(String name,String email, String password) throws InvalidAttributeValueException {
        setName(name);
        setEmail(email);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidAttributeValueException {
        if(!email.contains("@"))
            throw new InvalidAttributeValueException("O email deve conter @");
        if(!email.contains(".com"))
            throw new InvalidAttributeValueException("O email deve conter .com");
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidAttributeValueException {
        if(!(password.length() > 8))
            throw new InvalidAttributeValueException("A senha deve ter 8 caracteres");
        this.password = password;
    }
}