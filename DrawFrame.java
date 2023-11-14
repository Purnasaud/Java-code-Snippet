package com.Purna;
import javax.swing.*;
import java.awt.*;
public class DrawFrame extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public DrawFrame()
    {
        setTitle("DrawTest");
        setSize(WIDTH, HEIGHT);
         DrawPanel panel = new DrawPanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }
}
