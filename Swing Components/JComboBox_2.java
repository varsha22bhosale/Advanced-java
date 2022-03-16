import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JComboBox_2 extends JFrame implements ItemListener
{
	JLabel l1;
	JComboBox jb ;
	String[] str ={"Solapur","Pune","Banglore","Mumbai"};
	JComboBox_2()
	{
		Font f1 = new Font("Times New Romans",Font.BOLD,20);
		jb = new JComboBox(str);
		jb.setBounds(70,70,300,100);
		jb.setFont(f1);
		l1= new JLabel(" ");
		l1.setBounds(390,100,200,40);
		l1.setFont(f1);
		
		add(jb);
		add(l1);
		jb.addItemListener(this);
		
		setLayout(null);
		setSize(800,800);
		setVisible(true);
		setTitle("Practical JComboBox");
	}
	public void itemStateChanged(ItemEvent e)
	{
		String getItem = (String)jb.getSelectedItem();
		
		if(getItem.equals(str[0]))
		{
			l1.setText("You are in Solapur ");
		}
		else if(getItem.equals(str[1]))
		{
			l1.setText("You are in Pune");
		}
		else if(getItem.equals(str[2]))
		{
			l1.setText("You are in Banglore");
		}
		else if(getItem.equals(str[3]))
		{
			l1.setText("You are in Mumbai");
		}
	}
	public static void main(String args[])
	{
		JComboBox_2 obj = new JComboBox_2();
	}
}
