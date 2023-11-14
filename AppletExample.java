

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class AppletExample extends JApplet implements ActionListener
{
	JLabel label;
	JButton button;
   public void init()
   {
      Container contentPane = getContentPane();
      JLabel label = new JLabel();
	  label.setBounds(300,500,450,460);
	  label.setLayout(new FlowLayout());
	  JButton button = new JButton("Check The Information");
	  JPanel panel= new JPanel ();
	  panel.add(label);
	    panel.add(button, BorderLayout.NORTH);// borderLayout.PAGE_START);
      contentPane.add(panel);
	  button.addActionListener(this);
	  
	  
	  
	    }
		public void actionPerformed(ActionEvent evt)
		{
			Graphics g= getGraphics();
			Font f1= new Font ("SansSerif", Font.ITALIC+ Font.BOLD,34);
			g.setFont(f1);
			g.setColor(Color.black);
			g.drawString("Principle of Levelling", 100,100);
			Font f2= new Font ("Monospaced", Font.BOLD,30);
			g.setFont(f2);
			g.setColor(Color.green);
			g.drawString("The main Principle of a Levelling is to find unknown point with reference to a known point.",200,200);
		}
		}
