JFrame-In-FullScreen
====================

import javax.swing.*;
import java.awt.*;

public class FullScreenJFrame extends JFrame
{
  public FullScreenJFrame()
  {
    super("Fullscreen");
    getContentPane().setPreferredSize( Toolkit.getDefaultToolkit().getScreenSize());
    pack();
    setResizable(false);
    show();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SwingUtilities.invokeLater(new Runnable() {
      public void run()
      {
        Point p = new Point(0, 0);
        SwingUtilities.convertPointToScreen(p, getContentPane());
        Point l = getLocation();
        l.x -= p.x;
        l.y -= p.y;
        setLocation(l);
      }
    });
  }
  public static void main(String[] ar)
  {
	new FullScreenJFrame();
  }
}
