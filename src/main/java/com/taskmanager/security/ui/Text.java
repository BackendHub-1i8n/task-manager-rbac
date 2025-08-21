package com.taskmanager.security.ui;

import com.taskmanager.security.theme.ColorPalette;
import com.taskmanager.security.theme.ThemeListener;
import com.taskmanager.security.theme.ThemeManager;

import javax.swing.*;
import java.awt.*;

public class Text extends JLabel implements ThemeListener {

    public interface HtmlText extends BuildStep {
        HtmlText setTitle(String tag);
        HtmlText setBold();
        HtmlText setItalic();
        HtmlText setUnderline();
        HtmlText text(String text);

    }
    public interface PlainText {
        PlainText text(String text);
        HtmlText isHtml();
        BuildStep font(Font font);
        BuildStep color(Color color);
        BuildStep align(int alignment);
        Text build();
    }

    public interface BuildStep {
        BuildStep font(Font font);
        BuildStep color(Color color);
        BuildStep align(int alignment);
        Text build();
    }

    private Text(String content, boolean isHtml, Font font, Color color, int alignment) {
        super(isHtml ? "<html>" + content + "</html>" : content);
        setFont(font);
        setForeground(color);
        setHorizontalAlignment(alignment);
        ThemeManager.getInstance().addListener(this);
        applyTheme(ThemeManager.getInstance().getColorPalette());
    }
    @Override
    public void themeChanged(ColorPalette newPalette) {
        applyTheme(newPalette);
        repaint();
    }

    private void applyTheme(ColorPalette palette) {
        setBackground(palette.getBackground());
        setForeground(palette.getForeground());
    }

    public static class Builder implements PlainText, HtmlText {
        private String text = "";
        private boolean isHtml = false;
        private StringBuilder htmlTags = new StringBuilder();
        private Font font = new Font("SansSerif", Font.PLAIN, 14);
        private Color color = Color.BLACK;
        private int alignment = SwingConstants.LEFT;


        @Override
        public HtmlText setTitle(String tag) {
            htmlTags.append("<").append(tag).append(">");
            htmlTags.insert(0, "</" + tag + ">");
            return this;
        }

        @Override
        public HtmlText setBold() {
            htmlTags.append("<b>");
            htmlTags.insert(0, "</b>");
            return this;
        }

        @Override
        public HtmlText setItalic() {
            htmlTags.append("<i>");
            htmlTags.insert(0, "</i>");
            return this;
        }

        @Override
        public HtmlText setUnderline() {
            htmlTags.append("<u>");
            htmlTags.insert(0, "</u>");
            return this;
        }

        @Override
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        @Override
        public HtmlText isHtml() {
            isHtml = true;
            return this;
        }

        @Override
        public BuildStep font(Font font) {
            this.font = font;
            return this;
        }

        @Override
        public BuildStep color(Color color) {
            this.color = color;
            return this;
        }

        @Override
        public BuildStep align(int alignment) {
            this.alignment = alignment;
            return this;
        }

        @Override
        public Text build() {
            String finalText = text;
            if (isHtml && !htmlTags.isEmpty()) {
                String openTags = htmlTags.toString().replaceAll("</[a-zA-Z0-9]+>", "");
                String closeTags = htmlTags.toString().replaceAll("<[a-zA-Z0-9]+>", "");
                finalText = openTags + text + closeTags;
            }
            return new Text(finalText, isHtml, font, color, alignment);
        }
    }

    public static PlainText builder() {
        return new Builder();
    }
}
