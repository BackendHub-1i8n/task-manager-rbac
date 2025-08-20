package com.taskmanager.security.contracts;

public record InProgress() implements TaskStatus {
    @Override
    public String status() {
        return "in progress";
    }

    @Override
    public void changeStatus() {

    }

    @Override
    public void setStatus(String status) {

    }
}
