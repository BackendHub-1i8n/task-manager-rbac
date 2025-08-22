package com.taskmanager.security.ui.Menu;

import com.taskmanager.security.theme.ColorPalette;
import com.taskmanager.security.theme.ThemeListener;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;

public class MenuBar extends JMenuBar implements ThemeListener {
    public MenuBar() {
        // Initialize the menu bar with default items
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");


        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.setIcon(new ImageIcon("icons/exit.png"));

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);

        add(fileMenu);
        add(editMenu);
        add(viewMenu);
        add(helpMenu);

        // Add theme listener
        ThemeManager.getInstance().addListener(this);
        applyTheme(ThemeManager.getInstance().getColorPalette());
    }

    @Override
    public void themeChanged(ColorPalette newPalette) {
        // Update the menu bar's appearance based on the new theme
        setBackground(newPalette.getBackground());
        setForeground(newPalette.getForeground());
    }

    @Override
    public void applyTheme(ColorPalette palette) {
        setBackground(palette.getBackground());
        setForeground(palette.getForeground());
    }
}
