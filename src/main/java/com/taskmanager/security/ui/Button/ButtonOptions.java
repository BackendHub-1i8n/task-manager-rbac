package com.taskmanager.security.ui.Button;

import com.taskmanager.security.enums.ButtonColorVariants;
import com.taskmanager.security.enums.ButtonSize;

import javax.swing.*;

public interface ButtonOptions {
    ButtonOptions variant(ButtonColorVariants variant);
    ButtonOptions size(ButtonSize size);
    ButtonOptions icon(Icon icon);
    ButtonOptions onClick(Runnable action);
    JButton build();
}
