/**
   @version 1.00 2000-04-13
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; 
// to resolve conflict with java.util.Timer

public class TimerTest
{  
   public static void main(String[] args)
   {  
      TimePrinter listener = new TimePrinter();

      // construct a timer that calls the listener
      // once every 1 second
      Timer t = new Timer(1000, listener);
      t.start();
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      Date now = new Date();
      System.out.println("The time now is " + now);
   }
}
