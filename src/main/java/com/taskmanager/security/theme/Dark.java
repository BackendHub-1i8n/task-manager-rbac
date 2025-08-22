package com.taskmanager.security.theme;

import java.awt.*;

public final class Dark implements ColorPalette{
    @Override
    public String getName() {
        return "";
    }

    @Override
    public Color getBackground() {
        return new Color(18, 18, 18);
    }

    @Override
    public Color getForeground() {
        return Color.WHITE;
    }

    @Override
    public Color getPrimary() {
        return new Color(100, 181, 246);
    }

    @Override
    public Color getSecondary() {
        return new Color(48, 48, 48);
    }

    @Override
    public Color getAccent() {
        return new Color(255, 160, 0);
    }

    @Override
    public Color getHoverBackground() {
        return new Color(30, 30, 30);
    }
}
