package com.taskmanager.security.models;

import com.taskmanager.security.enums.Role;

import java.util.List;

public class User {
    private String username;
    private String password;
    private Role role;
    private List<Task> tasks;
    private Project project;
}
