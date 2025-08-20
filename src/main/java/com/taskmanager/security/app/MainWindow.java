package com.taskmanager.security.app;

import com.taskmanager.security.theme.Dark;
import com.taskmanager.security.theme.Light;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Task Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        // Set fullscreen mode
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // bground color and foreground color
        setBackground(ThemeManager.getPalette().getBackground());
        setForeground(ThemeManager.getPalette().getForeground());
        // Initialize components here
        initUI();
        changeTheme();
    }

    private void initUI() {
        // Add UI components like menus, panels, etc.
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
    }

    private void changeTheme() {
        // Logic to change theme can be added here
        // For example, using ThemeManager to set a new palette
        // ThemeManager.setPalette(new Dark());
        ButtonGroup group = new ButtonGroup();
        JRadioButton lightTheme = new JRadioButton("Light Theme");
        JRadioButton darkTheme = new JRadioButton("Dark Theme");
        group.add(lightTheme);
        group.add(darkTheme);
        lightTheme.addActionListener(e -> {
            // Change to light theme
            ThemeManager.setPalette(new Light());
            System.out.println("Switched to Light Theme");
            this.revalidate();
            this.repaint();
        });
        darkTheme.addActionListener(e -> {
            // Change to dark theme
            ThemeManager.setPalette(new Dark());
            System.out.println("Switched to Dark Theme");
            this.revalidate();
            this.repaint();
        });

        // Add the radio buttons to a panel or dialog
        JPanel themePanel = new JPanel();
        themePanel.add(lightTheme);
        themePanel.add(darkTheme);
        // Update the UI to reflect the new theme
        this.add(themePanel);
        this.setVisible(true);
        this.getContentPane().setBackground(ThemeManager.getPalette().getBackground());
        this.getContentPane().setForeground(ThemeManager.getPalette().getForeground());
    }
}
