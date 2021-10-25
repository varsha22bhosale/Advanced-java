// java frame program
import java.awt.*;
class FrameDemo extends Frame
{
    public void paint(Graphics g)
	{ 
	   setForeground(Color.black);
	   setBackground(Color.pink);
	   g.drawString(" This is my first frame",150,250);
	   
	}
	public static void main (String args[])
	{
	    FrameDemo f=new FrameDemo();
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setTitle("my_frame");
		
	}
}