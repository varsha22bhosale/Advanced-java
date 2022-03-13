import java.awt.*;
import java.awt.event.*;//step1
class SquareDemo extends Frame implements ActionListener//step 2
{
	Label l1,l2,l3;
	TextField t1;
	Button b1,b2;
	SquareDemo()
	{
		setLayout(null);
		
		Font f1 = new Font("Times New Romans",Font.BOLD,35);
		setFont(new Font("Times New Romans",Font.BOLD,20));
		setBackground(Color.gray);
		
		l1 = new Label("Calculate Square Of Number");
		l1.setForeground(Color.yellow);
		l1.setBounds(180,80,500,100);
		l1.setFont(f1);
		
		l2 = new Label (" Enter Number:");
		l2.setBounds(180,310,150,50);
		
		l3 = new Label(" ");
		l3.setBounds(150,550,700,60);
		l3.setFont(f1);
		l3.setForeground(Color.yellow);
		
		t1 = new TextField();
		t1.setBounds(350,310,150,50);
		
		b1= new Button("Square");
		b1.setBounds(240,420,100,60);
		
		b2 = new Button("Clear");
		b2.setBounds(380,420,100,60);
		
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		add(b2);
		add(l3);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);//step 3
		
		setSize(800,800);
		setVisible(true);
		setTitle("Calculate Square demo");
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a = Integer.parseInt(t1.getText());
		if(ae.getSource()==b1)
		{
			int b=a*a;
			l3.setText("square of entered number -->  "+b);	
		}
		else
		{
			t1.setText("  ");
			l3.setText("  ");
		}
	}
	public static void main(String args[])
	{
		new SquareDemo();
	}
}