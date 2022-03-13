import java.awt.*;
class CkecjboxGroupDemo extends Frame
{
	CkecjboxGroupDemo ()
		{
			/*FlowLayout f = new FlowLayout();
			setLayout(f);*/
			setLayout(new FlowLayout());
			CheckboxGroup gp = new CheckboxGroup();
			Checkbox ch1 = new Checkbox("MALE",false, gp);
			Checkbox ch2 = new Checkbox("FEMALE",false,gp);
			add(ch1);
			add(ch2);
			
		}
		
	public static void main(String args[])
	{	
		CkecjboxGroupDemo obj = new CkecjboxGroupDemo();
		//obj.setLayout(new FlowLayout());
		obj.setSize(600,600);
		obj.setVisible(true);
		obj.setTitle("CHECK BOX GROUP RADIO BUTTON demo ");
		
		
	}
}