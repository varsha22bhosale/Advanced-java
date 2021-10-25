//frame in applet 
import java.applet.*;
import java.awt.*;
class AppletFrame extends Frame
{
	AppletFrame(String title)
	{
		super(title);
	}
	public void paint(Graphics g)
	{
		g.drawString("i am in frame",200,400);
		
	}
}
 public class FrameApplet extends Applet
{
	public void init()
	{
		AppletFrame f=new AppletFrame("varsha");
		f.setVisible(true);
		f.setSize(600,600);
	
	}
	public void paint(Graphics g)
	{
		g.drawString("i am in applet",200,200);
	}
}	
/*<applet code="FrameApplet.class" width=400 height=400>
</applet> */