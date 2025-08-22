package com.taskmanager.security.models;

import com.taskmanager.security.enums.ProjectStatus;
import com.taskmanager.security.enums.TaskStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Project {
    private Long id;
    private String name;
    private String description;
    private ProjectStatus status;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Task> tasks;
    private List<ProjectMember> members;


    public Project() {
    }

    public  Project(Long id) {
        this.id = id;
    }

    public Project(Long id, String name, String description, ProjectStatus status, LocalDate startDate, LocalDate endDate) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Project(Long id, String name, String description) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.name = name;
        this.description = description;
        this.status = ProjectStatus.PLANNING;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now().plusDays(30); // Default end date is 30 days from start date
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void addMember(User user, Role role) {
        this.members.add(new ProjectMember(user, role));
    }

    public void removeMember(User user) {
        this.members.removeIf(member -> member.getUser().equals(user));
    }

    public void updateStatus(ProjectStatus status) {
        this.status = status;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.removeIf(t -> t.getId().equals(task.getId()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProjectMember> getMembers() {
        return members;
    }

    public void setMembers(List<ProjectMember> members) {
        this.members = members;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(t -> t.getStatus().equals(status))
                .toList();
    }
}
