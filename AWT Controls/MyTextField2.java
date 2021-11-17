import java.awt.*;
class MyTextField2 extends Frame
{
	MyTextField2()
	{
		setFont(new Font("Times New Romans",Font.BOLD,20));
		//setBackground(Color.pink);
		setForeground(Color.blue);
		TextField t1,t2,t3,t4;
		Label l1,l2,l3,l4;
		l1 = new Label("enter name");
		l2 = new Label ("enter department");
		l3 = new Label ("enter roll no");
		l4 = new Label ("enter password");
		add(l1);
		l1.setBounds(100,100,150,30);

		add(l2);
		l2.setBounds(100,200,170,30);

		add(l3);
		l3.setBounds(100,300,150,30);

		add(l4);
		l4.setBounds(100,400,150,30);

		t1 = new TextField();
		t2 = new TextField(5);
		t3 = new TextField("*********");
		t4 = new TextField();
		add(t1);
		t1.setBounds(300,100,300,30);
		
		add(t2);
		t2.setBounds(300, 200,300,30);
		
		add(t3);
		t3.setBounds(300, 300, 300, 30);
		
		add(t4);
		t4.setBounds(300,400,300,30);
		t4.setEchoChar('*');
		
		//setLayout(new FlowLayout());
	    setLayout(null);

		setSize(800,800);
		setVisible(true);
		setTitle("TEXT FIELD MAKER");
	}
	public static void main (String args[])
	{
		MyTextField2 obj = new MyTextField2();
	}
}
