package com.taskmanager.security.contracts;

public record Pending() implements TaskStatus {
    @Override
    public String status() {
        return "pending";
    }

    @Override
    public void changeStatus() {

    }

    @Override
    public void setStatus(String status) {

    }
}
