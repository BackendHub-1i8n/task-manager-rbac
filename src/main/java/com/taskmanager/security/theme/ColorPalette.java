package com.taskmanager.security.theme;

import com.taskmanager.security.contracts.ButtonVariants;

import java.awt.*;

public sealed interface ColorPalette permits Dark, Light{
    String getName();

    Color getBackground();
    Color getForeground();
    Color getPrimary();
    Color getSecondary();
    Color getAccent();
    Color getHoverBackground();

    ButtonVariants getPrimaryButtonColor();
    ButtonVariants getSecondaryButtonColor();
    ButtonVariants getSuccessButtonColor();
    ButtonVariants getDangerButtonColor();
    ButtonVariants getWarningButtonColor();
    ButtonVariants getInfoButtonColor();

    Dimension getSmallButtonSize();
    Dimension getMediumButtonSize();
    Dimension getLargeButtonSize();
}
