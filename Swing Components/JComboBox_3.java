import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JComboBox_3 extends JFrame implements ItemListener
{
	JLabel l1;
	JComboBox jb ;
	String[] arr ={"Maharashtra","Gujarat","Kerala","Delhi","Punjab","Goa"};
	JComboBox_3()
	{
		Font f1 = new Font("Times New Romans",Font.BOLD,20);
		jb = new JComboBox(arr);
		jb.setBounds(70,70,300,100);
		jb.setFont(f1);
		l1= new JLabel(" ");
		l1.setBounds(100,370,500,40);
		l1.setForeground(Color.red);
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
		
		if(getItem.equals(arr[0]))
		{
			l1.setText("You Have Selected Maharashtra ");
		}
		else if(getItem.equals(arr[1]))
		{
			l1.setText("You Have Selected Gujarat ");
		}
		else if(getItem.equals(arr[2]))
		{
			l1.setText("You Have Selected Kerala");
		}
		else if(getItem.equals(arr[3]))
		{
			l1.setText("You Have Selected Delhi");
		}
		else if(getItem.equals(arr[4]))
		{
			l1.setText("You Have Selected Punjab");
		}
		else if(getItem.equals(arr[5]))
		{
			l1.setText("You Have Selected Goa");
		}
	}
	public static void main(String args[])
	{
		JComboBox_3 obj = new JComboBox_3();
	}
}
