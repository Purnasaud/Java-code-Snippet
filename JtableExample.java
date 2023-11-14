package com.Purna;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.Scanner;

/*
     * A basic swing example with JTable
     */
    class JTableExample extends JFrame {
    private String name;
    private int farmer_id;
    private String majorcrop;
    private double area;

    public JTableExample(String name, int farmer_id, String majorcrop, double area) {
        this.name = name;
        this.farmer_id = farmer_id;
        this.majorcrop = majorcrop;
        this.area = area;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        String[] column = {"Farmer_id", "Name", "Majorcrop", "area"};
        JTable jt = new JTable(JTableExample column);
        JScrollPane sp = new JScrollPane(jt);
    }
       /* static Scanner sc= new Scanner(System.in);
            String[][] data =    new String[4][4];
            // {{"01", "Alex", "18"}, {"02", "Brandon", "20"}, {"03", "Cassie", "18"}, {"04", "Steve", "25"}};
            String[] column = {"Farmer_id", "Name", "Majorcrop", "area"};
             public JTableExample()
             {
              for (int i = 0; i<4; i++)
                 {
                     System.out.println("Entering data for " + (i+1) + " Farmer");
                     for (int j =0;i<4;j++)
                     System.out.println("Enter Farmer_id");
                     data[i][j]=sc.next();
                     System.out.println("Enter name");
                     data [i][j]=sc.next();
                     System.out.println("Enter your Major Crop");
                    data [i][j]=sc.next();
                     System.out.println("Enter your Farm Area");
                     data [i][j]=sc.next();
                     }
                                }
            // Create JTable
            JTable jt = new JTable(data, column);
            JScrollPane sp = new JScrollPane(jt);
           *//* this.add(sp);
            this.pack();*//*
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);*/
    }
