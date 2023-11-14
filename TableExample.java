/*
package com.Purna;

import javax.swing.*;
import java.util.Scanner;

public class TableExample {
    public static Scanner sc= new Scanner(System.in);
    JFrame f;
    public TableExample() {
        f = new JFrame();
      //  int[][] ints = new int[5][5];
        String data[] = new String[5];
        for (int i=0;i<5;i++) {
            System.out.println("eNTER NAME");
            String name = sc.next();
            System.out.println("Enter farmer_id");
            int id = sc.nextInt();
            System.out.println("Enter major crop");
            String majorcrop = sc.next();
            System.out.println("Enter area");
         double   area = sc.nextDouble();
        }
        String column[] = {"Name", "Farmer_id", "Area","Major_Crop"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
}
*/
