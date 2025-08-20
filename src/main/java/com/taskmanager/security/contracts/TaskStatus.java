package com.taskmanager.security.contracts;

public sealed interface TaskStatus permits Pending, InProgress, Completed{
    String status();
    void changeStatus();
    void setStatus(String status);
}