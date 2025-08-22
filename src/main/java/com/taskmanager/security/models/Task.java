package com.taskmanager.security.models;

import com.taskmanager.security.enums.Priority;
import com.taskmanager.security.enums.TaskStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private Priority priority;
    private LocalDate dueDate;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String title, String description, User user) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.title = title;
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.status = TaskStatus.TODO; // Default status
        this.priority = Priority.MEDIUM; // Default priority
        this.dueDate = LocalDate.now().plusDays(7); // Default due date is 7 days from now
        this.user = user;
    }

    public Task(Long id, String title, String description, TaskStatus status, Priority priority, LocalDate dueDate, User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
        this.user = user;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public void updateStatus(TaskStatus status) {
        this.status = status;
    }

    public void assignUser(User user) {
        this.user = user;
    }

    public void unassignUser() {
        this.user = null;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Boolean isOverdue() {
        return dueDate != null && dueDate.isBefore(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
