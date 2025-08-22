package com.taskmanager.security.app;

import com.taskmanager.security.theme.Dark;
import com.taskmanager.security.theme.Light;
import com.taskmanager.security.theme.ThemeManager;
import com.taskmanager.security.ui.Menu.MenuBar;
import com.taskmanager.security.ui.Panel;
import com.taskmanager.security.ui.Text;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Task Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
        initUI();
        changeTheme();
    }

    private void initUI() {
        // Add UI components like menus, panels, etc.
        MenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);
    }

    private void changeTheme() {
        // Logic to change theme can be added here
        // For example, using ThemeManager to set a new palette
        // ThemeManager.setPalette(new Dark());
        JButton toggleTheme = new JButton("Cambiar Tema");

        toggleTheme.addActionListener(e -> {
            ThemeManager tm = ThemeManager.getInstance();
            if (tm.getColorPalette() instanceof Light) {
                tm.setPalette(new Dark());
            } else {
                tm.setPalette(new Light());
            }
        });

        // Add the radio buttons to a panel or dialog
        Panel themePanel = new Panel();
        themePanel.add(toggleTheme);

        // Texto plano: no aparecen métodos HTML
        Text normal = Text.builder()
                .text("Texto normal")
                .build();

        // Texto HTML: ahora sí aparecen métodos HTML
        Text titulo = Text.builder()
                .isHtml()
                .setTitle("h1")
                .setItalic()
                .setBold()
                .setUnderline()
                .text("Demo de Texto HTML")
                .align(SwingConstants.CENTER)
                .build();

        // Add the text components to the theme panel
        themePanel.add(normal);
        themePanel.add(titulo);
        // Apply the current theme to the panel
        themePanel.setLayout(new FlowLayout());

        // Update the UI to reflect the new theme
        themePanel.setBackground(ThemeManager.getInstance().getColorPalette().getBackground());
        themePanel.setForeground(ThemeManager.getInstance().getColorPalette().getForeground());
        this.add(themePanel);
    }
}
