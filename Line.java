import java.awt.*;
import java.applet.*;
public class Line extends Applet
{
 public void paint(Graphics g)
{
   g.drawLine(100,200,200, 170);
   g.setColor(Color.black);
   g.drawRect(150, 150, 100, 100);
   g.drawOval(70,30,100,100);
  
   
}
}