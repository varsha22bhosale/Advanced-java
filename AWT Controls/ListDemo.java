import java.awt.*;
class ListDemo extends Frame
{
	ListDemo()
	{
		setLayout(new FlowLayout());
		List l = new List(5,true);
		l.add("varsha");
		l.add("harsha");
		l.add("kedar");
		l.add("aditya");
		l.add("kalyani");
		l.add("dilip");
		l.add("sayali");
		l.add("nilam");
		l.add("kakya");
		l.add("virat",0);//inserting element at a perticular position
		add(l);
		l.select(0);// 0th position element will be select-- by passing index
		l.remove("virat");//removing element by passing string
		l.remove(0);// removing element by passing index
	}
	public static void main (String args[])
	{
		ListDemo obj = new ListDemo();
		obj.setSize(700,700);
		obj.setVisible(true);
		obj.setTitle("LIST");
	}
}