package com.taskmanager.security.theme;

public class ThemeManager {
    private static ColorPalette palette = new Dark();

    public static void setPalette(ColorPalette palette) {
        if (palette == null) {
            throw new IllegalArgumentException("Palette cannot be null");
        }
        ThemeManager.palette = palette;
    }

    public static ColorPalette getPalette() {
        return palette;
    }
}
