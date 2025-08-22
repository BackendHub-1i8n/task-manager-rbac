package com.taskmanager.security.ui;

import com.taskmanager.security.theme.ColorPalette;
import com.taskmanager.security.theme.ThemeListener;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;

public class Panel extends JPanel implements ThemeListener {

    public Panel() {
        ThemeManager.getInstance().addListener(this);
        applyTheme(ThemeManager.getInstance().getColorPalette());
    }

    @Override
    public void themeChanged(ColorPalette newPalette) {
        applyTheme(newPalette);
        repaint();
    }
    @Override
    public void applyTheme(ColorPalette palette) {
        setBackground(palette.getBackground());
        setForeground(palette.getForeground());
    }
}
