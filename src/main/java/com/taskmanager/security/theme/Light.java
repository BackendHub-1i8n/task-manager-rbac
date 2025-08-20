package com.taskmanager.security.theme;

import java.awt.*;

public final class Light implements ColorPalette{
    @Override
    public String getName() {
        return "";
    }

    @Override
    public Color getBackground() {
        return Color.WHITE;
    }

    @Override
    public Color getForeground() {
        return Color.BLACK;
    }

    @Override
    public Color getPrimary() {
        return new Color(33, 150, 243);
    }

    @Override
    public Color getSecondary() {
        return new Color(224, 224, 224);
    }

    @Override
    public Color getAccent() {
        return new Color(255, 193, 7);
    }
}
