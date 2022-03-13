import java.awt.*;
class CheckboxDemo extends Frame
{
	CheckboxDemo()
	{
		
		add(new Checkbox("JAVA",true));//this checkbox will be displayas selected cause of true value
		add(new Checkbox("PYTHON"));
		add(new Checkbox("RUBI"));
		add(new Checkbox("#C"));	
	}	
	public static void main (String args[])
	{
		CheckboxDemo obj = new CheckboxDemo();
		obj.setLayout(new FlowLayout());//instead of making seprate class for FlowLayout --define like this
		obj.setSize(700,700);
		obj.setVisible(true);
		obj.setTitle("CHECK BOX DEMO ");	
	}	
}
/*=============================SEE BELOW============================*/
/*{	
	CheckboxDemo()
	{
		FlowLayout f = new FlowLayout();
		setLayout(f);
		add(new Checkbox("JAVA",true));//this checkbox will be displayas selected cause of true value
		add(new Checkbox("PYTHON"));
		add(new Checkbox("RUBI"));
		add(new Checkbox("#C"));	
	}	
	public static void main (String args[])
	{
		CheckboxDemo obj = new CheckboxDemo();
		obj.setSize(700,700);
		obj.setVisible(true);
		obj.setTitle("CHECK BOX DEMO ");	
	}	
}*/
/*===============================SEE BELOW=====================================
/*{
	CheckboxDemo()
	{
		FlowLayout f = new FlowLayout();
		setLayout(f);
		Checkbox ch1 = new Checkbox("JAVA",true);//this checkbox will be displayas selected cause of true value
		Checkbox ch2 = new Checkbox("PYTHON");
		Checkbox ch3 = new Checkbox("RUBI");
		Checkbox ch4 = new Checkbox("#C");
		add(ch1);
		add(ch2);
		add(ch3);
		add(ch4);
	}
	
	
	public static void main (String args[])
	{
		CheckboxDemo obj = new CheckboxDemo();
		obj.setSize(700,700);
		obj.setVisible(true);
		obj.setTitle("CHECK BOX DEMO ");
		
	}
	
}
*/