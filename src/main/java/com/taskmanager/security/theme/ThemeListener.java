package com.taskmanager.security.theme;

public interface ThemeListener {
    void themeChanged(ColorPalette newPalette);
    void applyTheme(ColorPalette palette);
}
