package com.taskmanager.security.enums;

public enum Priority {
    LOW,
    MEDIUM,
    HIGH,
    URGENT;

    public static Priority fromString(String priority) {
        return switch (priority.toUpperCase()) {
            case "LOW" -> LOW;
            case "MEDIUM" -> MEDIUM;
            case "HIGH" -> HIGH;
            case "URGENT" -> URGENT;
            default -> throw new IllegalArgumentException("Unknown priority: " + priority);
        };
    }
}
