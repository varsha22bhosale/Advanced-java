import java.awt.*;
class MyButtonV extends Frame
{
	MyButtonV()
	{
		Button btn1 = new Button ("SUBMIT");
		Button btn2 = new Button ("CANCEL");
		Button btn3 = new Button ("HELP");
		add(btn1);
		btn1.setBounds(500,100,100,80);
		add(btn2);
		btn2.setBounds(500,250,100,80);
		add(btn3);
		btn3.setBounds(500,400,100,80);
			
		setLayout(null);
		setSize(900,900);
		setVisible(true);
		setTitle("MY BUTTON");
	}
	public static void main (String args[])
	{
		MyButtonV obj = new MyButtonV();
	}
}