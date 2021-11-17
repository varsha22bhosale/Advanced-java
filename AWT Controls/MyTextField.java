import java.awt.*;
class MyTextField extends Frame
{
	MyTextField()
	{
		TextField t, t1, t2, t3 ;
		t = new TextField();
		t. setBounds(100,100,400,40);
		add(t);
		
		t1= new TextField(10);
		t1.setBounds(100,200,400,40);
		add(t1);
		
		t2= new TextField("enter password");
		t2.setBounds(100,300,400,40);
		add(t2);
		
		t3= new TextField("enter password",10);
		t3.setBounds(100,400,400,40);
		t3.setEchoChar('*');
		add(t3);
	
		
		Button btn=new Button("SUBMIT");
		add(btn);
		btn.setBounds(300,500, 50,40);
			
	}
	
	public static void main(String args[])
	{
		MyTextField f=new MyTextField();
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		f.setTitle("TEXTFEILD_DEMO");
	}
}