import java.awt.*;
class ButtonDemo extends Frame
{
	ButtonDemo()
	{
		FlowLayout f =new FlowLayout();
		setLayout(f);
		Button btn1=new Button("SUBMIT");
		Button btn2=new Button ("BACK");
		Button btn3=new Button ("HELP");
		add(btn1);
		add(btn2);
		add(btn3);
	}	
	public static void main (String args[])
	{
		ButtonDemo obj=new ButtonDemo();
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setTitle("BUTTON DEMO ");
	}
}