/*
 * Author: Purna Bahadur Saud
 * Program: Drawing Ellipse With Mouse Click
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class DrawingEllipse {
    public static void main(String[] args) {
        MouseFrame frame= new MouseFrame();
        frame.show();
    }
}
class MouseFrame extends JFrame implements MouseListener {
    public MouseFrame() {
        setSize(700, 500);
        setTitle("DRAWING ELLIPSE WITH MOUSE CLICKS");
        setLayout(null);
        JPanel panel = new JPanel(); // Creating JPanel
        Container cp = getContentPane();
        cp.add(panel);// Adding Panel to Contentpane
        setVisible(true);
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x= e.getX();  // Getting the X Coordinates of mouse Clicked location
        int y= e.getY(); /// Getting the Y Coordinates of mouse Clicked location
        Graphics g= getGraphics();
        Graphics2D g2d= (Graphics2D) g;
        g2d.setColor(new Color ((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256))); // Setting Random Color
        g2d.setStroke(new BasicStroke(3.0f));
		Rectangle2D rect= new Rectangle2D.Double(x,y,80,50);
        g2d.draw(rect); // Drawing Rectangle
        Ellipse2D ellipse= new Ellipse2D.Double();
        ellipse.setFrame(rect);  // Setting Ellipse inside a rectangle frame
        g2d.draw(ellipse);	// Drawing Ellipses
      
	}
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
