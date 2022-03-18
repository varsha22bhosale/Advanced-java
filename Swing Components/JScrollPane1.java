import java.awt.*;
import javax.swing.*;
class JPanel1 extends JPanel
{
	JPanel1()
	{
		setLayout(new GridLayout(6,6));
		for(int i=1;i<=150;i++)
		{
			add(new Button("Button "+i));
		}
	}
}
class JScrollPane1 extends Frame
{
	JScrollPane1()
	{
		JPanel1 jp = new JPanel1();
		//int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		//int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		//int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		//int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		//JScrollPane jsp = new JScrollPane(jp,v,h);
		JScrollPane jsp = new JScrollPane(jp);
		//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(jsp);
		
		setSize(800,800);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JScrollPane1();
	}
}
