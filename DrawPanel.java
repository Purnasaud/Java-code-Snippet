package com.Purna;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Scanner;
class DrawPanel extends JPanel
{
    static Scanner sc= new Scanner(System.in);
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
         Graphics2D g1=(Graphics2D) g;
        System.out.println("Enter Number of Vertices Of your Polygon");
        int n= sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        System.out.println("Enter X coordinates of your polygon");
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("Enter Y coordinates of your polygon");
        for (int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        Polygon pol = new Polygon( x, y, n);
        Line2D line = new Line2D.Double(x[1],y[1],x[2],y[2]);
        g1.drawPolygon(pol);
        g1.draw(line);

                 }
}
