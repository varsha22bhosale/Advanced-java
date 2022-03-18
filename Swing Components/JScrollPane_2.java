import java.awt.*;
import javax.swing.*;
class JScrollPane_2 extends Frame
{
	JScrollPane_2()
	{
		Font f = new Font("Curiuer",Font.BOLD,25);
		JTextArea jt1 = new JTextArea();
		jt1.setFont(f);
		//TextArea t1 = new TextArea(30,30);
		//JScrollPane jsp = new JScrollPane(jt1);
		//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		//int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		//int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(jt1,v,h);
		jsp.setBounds(40,80,600,600);
		add(jsp);
		
		setLayout(null);
		setSize(800,800);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new JScrollPane_2();
	}
}