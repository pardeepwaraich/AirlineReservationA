package com.entities;

public class User {
    private String username, userRole, password;

    // Constructors
    public User() {
        // Blank constructor
    }
    public User(String username, String userRole, String password) {
        this.username = username;
        this.userRole = userRole;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }
    public String getUserRole() {
        return userRole;
    }
    public String getPassword() {
        return password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
