package com.taskmanager.security.models;

import java.util.Set;
import java.util.UUID;

public class Role {
    private Long id;
    private String name;
    private String description;
    private Set<Permission> permissions;

    public Role() {
    }

    public Role(Long id) {
        this.id = id;
    }

    public Role(String name, String description) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.name = name;
        this.description = description;
    }

    public void addPermission(Permission permission) {
        this.permissions.add(permission);
    }

    public void removePermission(Permission permission) {
        this.permissions.remove(permission);
    }

    public Boolean hasPermission(Permission permission) {
        return this.permissions.contains(permission);
    }

    public Boolean hasPermission(String permission) {
        for (Permission perm : permissions) {
            if (perm.getName().equals(permission)) {
                return true;
            }
        }
        return false;
    }
}
