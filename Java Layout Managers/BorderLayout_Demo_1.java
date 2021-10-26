import java.awt.*;
class BorderLayout_Demo_1 extends Frame
{
	BorderLayout_Demo_1()
	{
		setBackground(Color.orange);
		setFont(new Font("Times New Romans",Font.BOLD,18));
		//BorderLayout BL = new BorderLayout ();// first constructor
		BorderLayout BL = new BorderLayout (30,30);//second constructor..added horizontal and vertical space.
		setLayout(BL);
		
		TextArea t1 = new TextArea("          Enter Your FeedBack Here...........");
		Button b2 = new Button("Page Up");
		Button b3 = new Button("Page Down");
		Button b4 = new Button("Next Page");
		Button b5 = new Button("Previous Page");
	
		
		add(t1,BorderLayout.CENTER);	
		add(b2,BorderLayout.NORTH);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.EAST);
		add(b5,BorderLayout.WEST);
		
		
		setSize(800,800);
		setVisible(true);
		setTitle("Border Layout");
		
	}
	public static void main (String args[])
	{
		new BorderLayout_Demo_1();
	}
}