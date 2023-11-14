/*
 * Author: Purna Bahadur Saud
 * Program: Point inside Polygon Test
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.util.Scanner;
public class PointTest{
    public static void main(String[] args) {
       ThisFrame frame= new ThisFrame();
       frame.readingPoint();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.show();
    }
}
class ThisFrame extends JFrame implements ActionListener { //Implementing action listener interface
    static Scanner sc= new Scanner(System.in);
    Double x1, y1;
    JLabel label;
    JButton button;
    Point2D point;
    Polygon polygon;
    Line2D line;
      public ThisFrame() {
        setSize(500, 500);
        setLayout(new FlowLayout());
        setTitle("Testing Point Inside Polygon");
        setVisible(true);
        button = new JButton("Check");
		button.setBounds(100,100,100,100);
        JPanel panel = new JPanel();
        panel.add(button);
        label= new JLabel();
		label.setFont(new Font("Verdana", Font.PLAIN, 18));
        panel.add(label);
        Container contentPane= getContentPane();
        contentPane.add(panel);
        button.addActionListener(this);
    }
    public void readingPoint() // Taking User Input for coordinates value of the point
    {
        System.out.println("Enter X Coordinates of a Points");
        x1= sc.nextDouble();
        System.out.println("Enter Y Coordinates of a Points");
        y1=sc.nextDouble();
    }
public void paint(Graphics g) {
    super.paintComponents(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));// Setting Random Color
    g2d.setStroke(new BasicStroke(2));
    polygon = new Polygon(new int[]{400, 500, 550, 550, 400}, new int[]{300, 250, 300, 350, 400}, 5);
    g2d.draw(polygon); // Drawing Polygon having 5 corners of given coordinates
}
        @Override
    public void actionPerformed(ActionEvent e) { // Overriding action performed methods
            Graphics g= getGraphics();
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(2));
            g2d.setColor(new Color ((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256)));
            point = new Point2D.Double(x1,y1);
            line= new Line2D.Double(0,0,x1,y1);  //Drawing Line From Origin of the frame to the Given Point
            g2d.draw(line);
        if(polygon.contains(point)==true) // Checking Contition Whether point lies inside Given polygon or not
        {
            label.setText("Point Lies Inside polygon");
        }
        else
        {
            label.setText("Point Doesnot lies inside polygon");
        }
    }
}
