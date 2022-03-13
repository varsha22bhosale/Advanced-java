import java.awt.*;
import java.awt.event.*;
class ChoiceDemo extends Frame implements ItemListener
{
	Label lb;
	Choice ch;
	ChoiceDemo()
	{
		setLayout(new FlowLayout());
		lb= new Label("                                                                              ");
		ch= new Choice ();
		ch.add("select food");
		ch.add("Ice-Cream");
		ch.add("Maggi");
		ch.add("Chiken");
		ch.add("Pizza");
		ch.add("Cold Drinks");
		
		add(ch);
		add(lb);
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ae)
	{
		String str = ch.getSelectedItem();
		if(str.equals("select food"))
		{
			lb.setText("please select  food items");
		}
		else
		{
			lb.setText("you have selected :  "+ str);
		}
	}
	public static void main (String args[])
	{
		ChoiceDemo obj = new ChoiceDemo();
		obj.setSize(600,600);
		obj.setVisible(true);
		obj.setTitle("Choice Demo");
	}
}