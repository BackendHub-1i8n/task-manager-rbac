package com.taskmanager.security.ui.Button;

import com.taskmanager.security.enums.ButtonColorVariants;
import com.taskmanager.security.enums.ButtonSize;
import com.taskmanager.security.theme.ColorPalette;
import com.taskmanager.security.theme.ThemeListener;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;

public class Button extends JButton implements ButtonText, ButtonOptions, ThemeListener {
    private String text;
    private ButtonColorVariants variant = ButtonColorVariants.PRIMARY;
    private ButtonSize size = ButtonSize.MEDIUM;
    private Icon icon = null;
    private Runnable action = null;

    public Button() {
        ThemeManager.getInstance().addListener(this);
        applyTheme(ThemeManager.getInstance().getColorPalette());
    }

    @Override
    public ButtonOptions text(String texto) {
        if (texto == null || texto.isBlank()) throw new IllegalArgumentException("El texto es obligatorio");
        this.text = texto;
        return this;
    }
    @Override
    public void themeChanged(ColorPalette newPalette) {
        applyTheme(newPalette);
        repaint();
    }
    @Override
    public void applyTheme(ColorPalette palette) {
        switch (variant){
            case PRIMARY -> {
                setBackground(palette.getPrimaryButtonColor().backgroundColor());
                setForeground(palette.getPrimaryButtonColor().textColor());
            }
            case SECONDARY -> {
                setBackground(palette.getSecondaryButtonColor().backgroundColor());
                setForeground(palette.getSecondaryButtonColor().textColor());
            }
            case SUCCESS -> {
                setBackground(palette.getSuccessButtonColor().backgroundColor());
                setForeground(palette.getSuccessButtonColor().textColor());
            }
            case DANGER -> {
                setBackground(palette.getDangerButtonColor().backgroundColor());
                setForeground(palette.getDangerButtonColor().textColor());
            }
            case WARNING -> {
                setBackground(palette.getWarningButtonColor().backgroundColor());
                setForeground(palette.getWarningButtonColor().textColor());
            }
            case INFO -> {
                setBackground(palette.getInfoButtonColor().backgroundColor());
                setForeground(palette.getInfoButtonColor().textColor());
            }
        }
    }

    @Override
    public ButtonOptions variant(ButtonColorVariants variant) {
        this.variant = variant;
        return this;
    }

    @Override
    public ButtonOptions size(ButtonSize size) {
        this.size = size;
        return this;
    }

    @Override
    public ButtonOptions icon(Icon icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public ButtonOptions onClick(Runnable action) {
        this.action = action;
        return this;
    }

    @Override
    public JButton build() {
        this.setText(text);
        if (icon != null) {
            this.setIcon(icon);
        }

        switch (size){
            case SMALL -> this.setPreferredSize(ThemeManager.getInstance().getColorPalette().getSmallButtonSize());
            case MEDIUM -> this.setPreferredSize(ThemeManager.getInstance().getColorPalette().getMediumButtonSize());
            case LARGE -> this.setPreferredSize(ThemeManager.getInstance().getColorPalette().getLargeButtonSize());
        }

        switch (variant){
            case PRIMARY -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getPrimaryButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getPrimaryButtonColor().textColor());
            }
            case SECONDARY -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getSecondaryButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getSecondaryButtonColor().textColor());
            }
            case SUCCESS -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getSuccessButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getSuccessButtonColor().textColor());
            }
            case DANGER -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getDangerButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getDangerButtonColor().textColor());
            }
            case WARNING -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getWarningButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getWarningButtonColor().textColor());
            }
            case INFO -> {
                setBackground(ThemeManager.getInstance().getColorPalette().getInfoButtonColor().backgroundColor());
                setForeground(ThemeManager.getInstance().getColorPalette().getInfoButtonColor().textColor());
            }
        }

        if (action != null)
            this.addActionListener(e -> action.run());

        return this;
    }

    public static ButtonText builder() {
        return new Button();
    }
}
