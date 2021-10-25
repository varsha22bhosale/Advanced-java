// displaying frame within applet
import java.applet.*;
import java.awt.*;
class AppletDemo extends Frame
{
	AppletDemo(String title)
	{
		super(title);
	}
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		g.drawString("heyy i am frame :)",100,100);
	}
	
}
 public class Official_Frame_5 extends Applet 
{
	public void init()
	{
		AppletDemo a=new AppletDemo("karad");
		a.setVisible(true);
		a.setSize(500,500);
		
	}
	public void paint(Graphics g)
	{
		setBackground(Color.pink);
		g.drawString("heyy i am applet :)",100,100);
	}
	
}
/* <applet code="Official_Frame_5.class" width=500 height=500>
</applet>*/