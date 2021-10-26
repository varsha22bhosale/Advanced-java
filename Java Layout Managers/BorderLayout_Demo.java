import java.awt.*;
class BorderLayout_Demo extends Frame
{
	BorderLayout_Demo()
	{
		setBackground(Color.red);
		setFont(new Font("Times New Romans",Font.BOLD,25));
		//BorderLayout BL = new BorderLayout ();// first constructor
		BorderLayout BL = new BorderLayout (50,50);//second constructor..added horizontal and vertical space.
		setLayout(BL);
		
		Button b1 = new Button("Center");
		Button b2 = new Button("North");
		Button b3 = new Button("South");
		Button b4 = new Button("East");
		Button b5 = new Button("West");
	
		
		add(b1,BorderLayout.CENTER);
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
		new BorderLayout_Demo();
	}
}