import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DrawingInfo extends Applet implements ActionListener
{
	JTextArea area;
	JButton button;
	JLabel label;
	JScrollPane scrollPane;
	  String text ="Department Of Geomatics Engineering is established in 2007"+
	  " With the motto of quality education for leadership in the field of Geospatial Technology.Initially it was jointly working with the" +
	  " department of Civil and geomatics Engineering currently it is a established independent called Department of Geomatics Engineering Since 2020" +
	  "there are 60 intake in each batch. Any candidate who wahts admit in GE department must pass the KUCBT test Conducted by KU";
	public void init()
		{
		label= new JLabel("Showing Information About Deartment of Geomatics Engineering");
		
        label.setOpaque(true);
		Font f= new Font("Serif", Font.ITALIC+Font.BOLD, 24);
		label.setFont(f);
        // Setting the foreground color to the Label Field in java         
		label.setForeground(Color.RED);
		label.setBounds(100,200,300,400);
		add(label);
		
    	area = new JTextArea(5, 40);
        area.setText(text);
		Font font= new Font ("Arial" , Font.BOLD,20);
		area.setFont(font);
		area.setForeground(Color.blue);
		
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
		area.setEditable(false);
		
        scrollPane = new JScrollPane(area);
		add(scrollPane, BorderLayout.CENTER);
		button.addActionListener(this);
		
		
			}
			public void actionPerformed(ActionEvent evt)
			{
				
			}

}