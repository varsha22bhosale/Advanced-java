//pain method in frame window program
import java.awt.*;
class Official_Frame_4 extends Frame
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		setBackground(Color.cyan);
		g.drawString("this is my frame hahaha",250,300);
	}
	public static void main (String args[])
	{
		Official_Frame_4 obj=new Official_Frame_4();
		obj.setVisible(true);
		obj.setSize(600,600);
		obj.setTitle("dislpaying frame");
	}
}