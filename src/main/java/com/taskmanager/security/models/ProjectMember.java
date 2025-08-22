package com.taskmanager.security.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class ProjectMember {
    private Long id;
    private User user;
    private Project project;
    private Role role;
    private Boolean isActive;
    private LocalDateTime joinedAt;

    public ProjectMember() {
    }
    public ProjectMember(Long id) {
        this.id = id;
    }

    public ProjectMember(Long id, User user, Project project, Role role) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.user = user;
        this.project = project;
        this.role = role;
        this.isActive = true; // Default to active
        this.joinedAt = LocalDateTime.now();
    }

    public ProjectMember(User user, Role role) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.user = user;
        this.role = role;
        this.isActive = true; // Default to active
        this.joinedAt = LocalDateTime.now();
    }

    public void updateRole(Role role) {
        this.role = role;
    }


    public Boolean canManageProject() {
        return this.role.hasPermission("MANAGE_PROJECT");
    }

    public Boolean canViewProject() {
        return this.role.hasPermission("VIEW_PROJECT");
    }

    public Boolean canEditProject() {
        return this.role.hasPermission("EDIT_PROJECT");
    }

    public Boolean canCreateTasks() {
        return this.role.hasPermission("CREATE_TASKS");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }
}
