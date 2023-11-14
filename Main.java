package com.Purna;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        String[] column = {"Farmer_id", "Name", "Majorcrop", "area"};
        JTableExample [] j = new JTableExample[5];
        for(int i =0;i<j.length;i++)
        {
            System.out.println("eNTER NAME");
            String  name= sc.next();
            System.out.println("Enter farmer_id");
            int id = sc.nextInt();
            System.out.println("Enter major crop");
            String majorcrop= sc.next();
            System.out.println("Enter area");
            double area= sc.nextDouble();
            j[i]=new JTableExample(name,id,majorcrop,area);
        }
        /*JTable jt = new JTable(j , column);
        JScrollPane sp = new JScrollPane(jt);*/
    }
}
