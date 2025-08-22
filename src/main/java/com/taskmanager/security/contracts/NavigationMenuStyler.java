package com.taskmanager.security.contracts;

import com.taskmanager.security.theme.ColorPalette;
import com.taskmanager.security.theme.ThemeListener;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;

public abstract class NavigationMenuStyler<T extends JComponent > implements ThemeListener {
    public NavigationMenuStyler() {
        ThemeManager.getInstance().addListener(this);
        applyTheme(ThemeManager.getInstance().getColorPalette());
    }

    public T getComponent() {
        return this.getComponent();
    }

    public abstract void applyTheme(ColorPalette colorPalette);
    public abstract void themeChanged(ColorPalette newPalette);
}
