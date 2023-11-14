package com.purna;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class MouseExample extends JFrame implements MouseMotionListener {
      public MouseExample ()
    {
        setTitle("Hello Java coders");
        setSize(600,600);
        setLayout(new FlowLayout());
        setLocation(300,300);
        setVisible(true);
        addMouseMotionListener(this);
        JLabel label = new JLabel("This is a Jlabael");
        Container c= getContentPane();
        JPanel panel= new JPanel();
        panel.add(label);
        c.add(panel);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g= getGraphics();
        g.setColor(Color.BLUE);
      g.fillRect(e.getX(),e.getY(),20,20);
      //  label.setText("X = " + e.getX(), "Y = " + e.getX());
      //  g.drawString("My name is Purna Bahadur Saud", e.getX(),e.getY());
            }

    @Override
    public void mouseMoved(MouseEvent e) {
        Graphics g= getGraphics();
       // g.drawString("My name is Purna Bahadur Saud", e.getX(),e.getY());
    }
}
