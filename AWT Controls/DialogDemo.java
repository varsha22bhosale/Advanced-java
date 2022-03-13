import java.awt.*;
class DialogDemo extends Frame
{
	public static void main(String args[])
	{
		DialogDemo obj = new DialogDemo();
		//obj.setLayout(null);
		obj.setSize(800,800);
		obj.setVisible(true);
		obj.setTitle("Dialog Box");	
		
		Label l1 = new Label("Do You Want To Save This File");
		Button b1 = new Button("OK");
		Button b2 = new Button("CANCEL");
		Dialog d = new Dialog(obj,"Save",true);
		l1.setBounds(100,150,250,30);
		d.add(l1);
		b1.setBounds(100,310,70,50);
		d.add(b1);
		b2.setBounds(200,310,70,50);
		d.add(b2);
		d.setLayout(null);
		d.setSize(400,400);
		d.setVisible(true);
		
		//d.setBounds(200,200,400,400);
	
		
		
		

	}
}