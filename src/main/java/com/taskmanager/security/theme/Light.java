package com.taskmanager.security.theme;

import com.taskmanager.security.contracts.ButtonVariants;

import java.awt.*;

public final class Light implements ColorPalette {
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

    @Override
    public Color getHoverBackground() {
        return new Color(240, 240, 240);
    }

    @Override
    public ButtonVariants getPrimaryButtonColor() {
        return new ButtonVariants(new Color(0, 111, 238), new Color(240, 247, 254));
    }

    @Override
    public ButtonVariants getSecondaryButtonColor() {
        return new ButtonVariants(new Color(120, 40, 200), new Color(253, 252, 254));
    }

    @Override
    public ButtonVariants getSuccessButtonColor() {
        return new ButtonVariants(new Color(23, 201, 100), new Color(2, 21, 11));
    }

    @Override
    public ButtonVariants getDangerButtonColor() {
        return new ButtonVariants(new Color(243, 18, 96), new Color(255, 253, 254));
    }

    @Override
    public ButtonVariants getWarningButtonColor() {
        return new ButtonVariants(new Color(245, 165, 36), new Color(23, 16, 3));
    }

    @Override
    public ButtonVariants getInfoButtonColor() {
        return new ButtonVariants(new Color(212, 212, 216), new Color(0, 0, 0));
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
