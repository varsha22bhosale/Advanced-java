//advanced java program for my official first Frame with parameterized constructor .
//==========> method 2 for creatinf frame window <===================

import java.awt.*;
class Official_Frame_2 extends Frame
{
	Official_Frame_2(String title)
	{
		super(title);
	}
	public static void main (String args[])
	{
		Official_Frame_2 obj=new Official_Frame_2("jeon jungkook");
		obj.setVisible(true);
		obj.setSize(400,600);
		
	}
}