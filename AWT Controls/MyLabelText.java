import java.awt.*;
class MyLabelText extends Frame
{
	MyLabelText()
	{
		Label l1=new Label(" Enter Email ");
		Label l2=new Label(" Enter Password ");
		TextField t1=new TextField();
		TextField t2=new TextField();
		Button btn=new Button("SUBMIT");
		add(l1);
		l1.setBounds(130,200,70,40);
		add(l2);
		l2.setBounds(130,300,100,40);
		add(t1);
		t1.setBounds(280,200,200,30);
		add(t2);
		t2.setBounds(280,300,200,30);
		add(btn);
		btn.setBounds(250,500,70,40);
		
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		setTitle("MyLabel");
		//remove(btn);-- it will remove submit button 
		//removeAll();-- it will remove all controls
	}
	public static void main (String args[])
	{
		MyLabelText obj=new MyLabelText();
	}
}