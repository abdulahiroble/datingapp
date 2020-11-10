package com.datingapp.datingapp.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CreateProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String username;
    private String firstName;
    private String lastName;
    private String telefonnr;
    private String email;
    // private boolean admin;

    public CreateProfile(String username, String firstName, String lastName, String telefonnr, String email) {

        this.username = username;
        this.telefonnr = telefonnr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return username + telefonnr + firstName + lastName + '\n';
    }
}
