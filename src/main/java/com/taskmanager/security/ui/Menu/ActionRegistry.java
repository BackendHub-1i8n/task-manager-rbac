package com.taskmanager.security.ui.Menu;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ActionRegistry {
    private final Map<String, Action> actions = new HashMap<>();

    public void register(String key, Action action) {
        actions.put(key, action);
    }

    public Action get(String key) {
        return actions.get(key);
    }
}
