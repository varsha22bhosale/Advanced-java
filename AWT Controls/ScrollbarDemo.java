import java.awt.*;
class ScrollbarDemo extends Frame
{
	ScrollbarDemo()
	{
		setLayout(null);
		setBackground(Color.black);
		Scrollbar vsc = new Scrollbar(Scrollbar.VERTICAL,0,10,0,150);
		Scrollbar hsc = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,150);
		vsc.setBounds(560,40,50,550);
		hsc.setBounds(10,560,540,50);
		vsc.setBackground(Color.red);
		hsc.setBackground(Color.green);
		add(vsc);
		add(hsc);
		
		
	}
	public static void main(String args[])
	{
		ScrollbarDemo obj = new ScrollbarDemo();
		obj.setSize(600,600);
		obj.setVisible(true);
		obj.setTitle("SCROLLBAR");
		
	}
}
