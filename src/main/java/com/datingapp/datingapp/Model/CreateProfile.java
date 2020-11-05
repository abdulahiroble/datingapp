package com.datingapp.datingapp.Model;

public class CreateProfile {
    private String userName;
    private int password;
    private boolean admin;
    private int phone;
    private String firstName;
    private String lastName;

    public CreateProfile(String userName, int password, boolean admin, int phone, String firstName, String lastName) {
        this.userName = userName;
        this.password = password;
        this.admin = admin;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int Password) {
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" + "user name=" + userName + ", password='" + password + '\'' + ", admin='" + admin + '\''
                + ", phone=" + phone + ", first name=" + firstName + ", last name=" + lastName;
    }
}
