package com.datingapp.datingapp.Model;

public class CreateProfile {

    private int userId;
    private int userId2;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int telefonnr;
    // private boolean admin;

    public CreateProfile(int userId, int userId2, String username, String password, String firstName, String lastName,
            int telefonnr) {

        this.userId = userId;
        this.username = username;
        this.password = password;
        this.telefonnr = telefonnr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
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

    public int getUserid() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    @Override
    public String toString() {
        return "Account{" + "user name=" + username + ", password='" + password + '\'' + '\'' + ", telefonnr="
                + telefonnr + ", first name=" + firstName + ", last name=" + lastName;
    }
}
