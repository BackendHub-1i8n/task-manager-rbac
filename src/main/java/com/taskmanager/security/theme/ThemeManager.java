package com.taskmanager.security.theme;

import java.util.ArrayList;
import java.util.List;

public class ThemeManager {
    private static ThemeManager instance;
    private ColorPalette colorPalette;
    private final List<ThemeListener> listeners = new ArrayList<>();

    private ThemeManager(ColorPalette initialPalette) {
        this.colorPalette = initialPalette;
    }

    public static ThemeManager getInstance() {
        if (instance == null) {
            instance = new ThemeManager(new Dark());
        }
        return instance;
    }

    public ColorPalette getColorPalette() {
        return colorPalette;
    }

    public void setPalette(ColorPalette palette) {
        this.colorPalette = palette;
        notifyListeners();
    }

    public void addListener(ThemeListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ThemeListener listener) {
        listeners.remove(listener);
    }

    private void notifyListeners() {
        for (ThemeListener listener : listeners) {
            listener.themeChanged(colorPalette);
        }
    }
}
