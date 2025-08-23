package com.taskmanager.security.theme;

import com.taskmanager.security.contracts.ButtonVariants;

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

    @Override
    public ButtonVariants getPrimaryButtonColor() {
        return new ButtonVariants(new Color(0, 111, 238), new Color(228, 240, 253));
    }

    @Override
    public ButtonVariants getSecondaryButtonColor() {
        return new ButtonVariants(new Color(157, 83, 211), new Color(228, 240, 253));
    }

    @Override
    public ButtonVariants getSuccessButtonColor() {
        return new ButtonVariants(new Color(23, 201, 100), new Color(2, 17, 9));
    }

    @Override
    public ButtonVariants getDangerButtonColor() {
        return new ButtonVariants(new Color(243, 18, 96), new Color(228, 240, 253));
    }

    @Override
    public ButtonVariants getWarningButtonColor() {
        return new ButtonVariants(new Color(245, 165, 36), new Color(254, 243, 247));
    }

    @Override
    public ButtonVariants getInfoButtonColor() {
        return new ButtonVariants(new Color(63, 63, 70), new Color(254, 243, 247));
    }

    @Override
    public Dimension getSmallButtonSize() {
        return new Dimension(80, 30);
    }

    @Override
    public Dimension getMediumButtonSize() {
        return new Dimension(100, 40);
    }

    @Override
    public Dimension getLargeButtonSize() {
        return new Dimension(120, 50);
    }
}
