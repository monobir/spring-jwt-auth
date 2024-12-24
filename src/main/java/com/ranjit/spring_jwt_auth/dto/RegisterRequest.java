package com.ranjit.spring_jwt_auth.dto;

public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role; // Send roles as strings like "USER" or "ADMIN"

    public RegisterRequest(String firstName, String role, String password, String username, String lastName) {
        this.firstName = firstName;
        this.role = role;
        this.password = password;
        this.username = username;
        this.lastName = lastName;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}

