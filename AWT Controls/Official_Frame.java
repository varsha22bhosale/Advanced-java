// advanced java program for my official first Frame with default constructor .
//==========> method 1 for creatinf frame window <===================
import java.awt.*;
class Official_Frame extends Frame
{
	public static void main (String args[])
	{
		Official_Frame f1=new Official_Frame();
		f1.setVisible(true);
		f1.setSize(500,800);
		f1.setTitle(" My Official Frame");
	}
	
}