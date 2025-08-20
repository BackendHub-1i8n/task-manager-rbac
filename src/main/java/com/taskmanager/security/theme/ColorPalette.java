package com.taskmanager.security.theme;

import java.awt.Color;

public sealed interface ColorPalette permits Dark, Light{
    String getName();

    Color getBackground();
    Color getForeground();
    Color getPrimary();
    Color getSecondary();
    Color getAccent();
}