import java.awt.*;
class LabelDemo extends Frame
{
	LabelDemo()
	{
		 FlowLayout f=new FlowLayout();
		//by default behaviour of FlowLayout manager is CENTER and it can be LEFT OR RIGHT
		//FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		//FlowLayout f=new FlowLayout(FlowLayout.RIGHT);		
		setLayout(f);
		setForeground (Color.white);
		setBackground(Color.black);
		Label L1=new Label(" Enter Email ");
		Label L2=new Label(" Enter Password ");		
		add(L1);
		add(L2);
	}	
	public static void main (String args[])
	{
		LabelDemo obj =new LabelDemo ();
		obj.setSize(600,600);
		obj.setVisible(true);
		obj.setTitle("MyLabel");
	}

}