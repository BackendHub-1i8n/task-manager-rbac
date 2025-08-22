package com.taskmanager.security.models;

import com.taskmanager.security.enums.Role;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Role role;

    public void login(String username, String password) {
        // Logic for user login
        // This could involve checking the username and password against a database
        // and setting the session or token for the user.
    }

    public void logout() {
        // Logic for user logout
        // This could involve invalidating the user's session or token.
    }

    public void updateProfile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.updatedAt = LocalDateTime.now();
    }

    public Boolean hasRole(Role role) {
        return this.role.equals(role);
    }
}
