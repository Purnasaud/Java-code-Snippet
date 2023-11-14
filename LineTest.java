/*
 * Author: Purna Bahadur Saud
 * Program: Line inside Polygon Test
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.Scanner;
public class LineTest {
    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
        frame.readingLine();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}
 class NewFrame extends JFrame implements ActionListener {  // Implementing mouse listener interface
    static Scanner sc= new Scanner(System.in);
    Line2D line;
    Polygon polygon;
   int n;
   double x1,y1,x2,y2;
    JPanel panel;
    JButton button;
    JLabel label;
     public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public NewFrame()  // Creating a new farame
    {
       setTitle("Testing Line Inside A Polygon");
       setSize(WIDTH, HEIGHT);
       Container contentPane = getContentPane();
       panel= new JPanel();
       setLayout(new FlowLayout());
       button= new JButton("Check");
	   button.setBounds(100,100,100,100);
       label= new JLabel();
	   label.setFont(new Font("Verdana", Font.PLAIN, 18));
       panel.add(button);
       panel.add(label);
       contentPane.add(panel);
       button.addActionListener(this); // Registering listener interface
    }
    public void readingLine () { // Reading coordinate for line
        System.out.println("Enter initial x1 Coordinates of line");
        x1 = sc.nextDouble();
        System.out.println("Enter initial y1 Coordinates of line");
        y1 = sc.nextDouble();
        System.out.println("Enter final x2 Coordinates of line");
        x2 = sc.nextDouble();
        System.out.println("Enter initial y2 Coordinates of line");
        y2 = sc.nextDouble();
    }
    /*public void readingPolygon()
    {
        System.out.println("Enter Number of Side of your Polygon");
        n = sc.nextInt();
        int alx []= new int [n];
        int aly []= new int [n];
        System.out.println("Enter X  coordinates of each side");
        for (int i = 0; i < n; i++) {
            alx[i]=sc.nextInt();

        }
        System.out.println("Enter Y coordinates of Each Side");
        for (int i=0;i<n;i++)
        {
            aly[i]=sc.nextInt();

        }

    }*/
       public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g1d= (Graphics2D) g;
                  g1d.setStroke(new BasicStroke(2.0f));
           g1d.setColor(new Color ((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256)));// Generating random Color
          polygon= new Polygon (new int [] {400,500,550,550,400}, new int[] {300,250,300,350,400},5);// Drawing a polygon
          g1d.drawPolygon(polygon );// Drawing Polygon
    }
      @Override
    public void actionPerformed(ActionEvent e) {  // Overriding actionperformed
        Graphics g= getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
         g2d.setColor(new Color ((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256)));
        line= new Line2D.Double(x1,y1,x2,y2);  //Drawing Line
        g2d.draw(line);
          if (polygon.contains(x1,y1) && polygon.contains(x2,y2) == true) //Checking the Condition Whether line lies inside given polygon or not
        {
            label.setText("Line Completely Lies Inside Polygon");
        }
          else if (polygon.contains(x1,y1)==true) {
              label.setText("Line Partially lies inside polygon");
          }
          else if (polygon.contains(x2,y2)==true) {
              label.setText("Line Partially lies inside polygon");
          }
          else
          {
              label.setText("Line Does not lies inside polygon");
          }
    }
}

