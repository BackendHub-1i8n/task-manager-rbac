package com.taskmanager.security.contracts;

public record Completed() implements TaskStatus {


    @Override
    public String status() {
        return "completed";
    }

    @Override
    public void changeStatus() {


    }

    @Override
    public void setStatus(String status) {

    }
}
