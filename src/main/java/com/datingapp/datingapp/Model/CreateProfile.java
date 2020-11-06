package com.datingapp.datingapp.Model;

public class CreateProfile {


    private int userid;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int phone;
    private boolean admin;




    public CreateProfile(int userid, String username, String password, String firstName, String lastName, int phone) {

        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
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

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getUserid() { return userid; }

    public void setUserid(int userid) { this.userid = userid; }

    public boolean isAdmin() { return admin; }

    @Override
    public String toString() {
        return "Account{" + "user name=" + username + ", password='" + password + '\'' + ", admin='" + admin + '\''
                + ", phone=" + phone + ", first name=" + firstName + ", last name=" + lastName;
    }
}
