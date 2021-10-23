import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	CalculatorDemo()
	{
		setLayout(null);
		setBackground(Color.pink);
		Font f = new Font ("Times New Romans",Font.BOLD,25);
		Font f1 = new Font ("Times New Romans",Font.BOLD,12);

		l1 = new Label("VARSHA'S CALCULATOR ");
		l2 = new Label("Enter first no :",Label.RIGHT);
		l3 = new Label("Enter second no :",Label.RIGHT);
		l4 = new Label("Result :",Label.RIGHT);
		l5 = new Label("Devoloped _by_ @Varsha_Bhosale");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		b5 = new Button("CLEAR");
		
		l1.setFont(f);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		t1.setFont(f);
		t2.setFont(f);
		t3.setFont(f);
		
		l1.setBounds(300,80,500,50);
		l2.setBounds(50,200,120,40);
		t1.setBounds(190,200,120,40);
		l3.setBounds(350,200,120,40);
		t2.setBounds(480,200,120,40);
		l4.setBounds(640,200,80,40);
		t3.setBounds(730,200,120,40);
		b1.setBounds(70,400,100,50);
		b2.setBounds(230,400,100,50);
		b3.setBounds(380,400,100,50);
		b4.setBounds(530,400,100,50);
		b5.setBounds(680,400,100,50);
		l5.setBounds(30,550,400,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l5);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		if(ae.getSource()==b1)
		{
			int z=x+y  ;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b2)
		{
			int z=x-y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b3)
		{
			int z=x*y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b4)
		{
			int z=x/y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b5)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	
	}
	public static void main (String args[])
	{
		CalculatorDemo obj=new CalculatorDemo();
		obj.setSize(900,600);
		obj.setVisible(true);
		obj.setTitle("CLACULATOR");
	}
}