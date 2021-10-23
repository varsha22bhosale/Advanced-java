import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TryEventHandlingSwing extends Frame implements ActionListener
{
	JButton b1;
	JButton b2;
	JButton b3;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JPanel p1;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	
	TryEventHandlingSwing()
	{
		Font f= new Font("Times New Romans",Font.BOLD,25);
		Font f1= new Font("Times New Romans",Font.BOLD,18);
		p1 = new JPanel();
		p1.setBounds(20,80,750,750);
		p1.setBackground(Color.orange);
		add(p1,BorderLayout.CENTER);
		
		b1 = new JButton("Attendance");
		b1.setFont(f);
		b1.setBounds(300,200,250,70);
		p1.add(b1);
		
		l1 = new JLabel();
		l1.setFont(f);
		
		
		l2 = new JLabel(" ");
		l2.setFont(f1);
		
		l3 = new JLabel(" ");
		l3.setFont(f1);
		
		l4 = new JLabel(" ");
		l4.setFont(f1);
		
		l5 = new JLabel(" ");
		l5.setFont(f1);
		
		l6 = new JLabel();
		l6.setFont(f1);
			
		t1 = new JTextField();
		t1.setFont(f1);
		
		t2 = new JTextField ();
		t2.setFont(f1);
		
		t3 = new JTextField ();
		t3.setFont(f1);
		
		t4 = new JTextField ();
		t4.setFont(f1);
		
		b2 = new JButton();
		b2.setFont(f);
		
		b3 = new JButton();
		b3.setFont(f);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setLayout(null);
		setSize(800,900);
		setVisible(true);
		setTitle("ActionEvent");
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			 l1.setText("STUDENT  ATTENDANCE  FORM");
			 l1.setBounds(180,100,400,50);
			 p1.add(l1);
			 l2.setText(" Enter Your Name");
			 l2.setBounds(150,200,200,50);
			 p1.add(l2);
			 t1.setText(" ");
			 t1.setBounds(380,210,250,30);
			 p1.add(t1);
			 l3.setText("Enter Your Email Id");
			 l3.setBounds(150,290,200,50);
			 p1.add(l3);
			 t2.setText(" ");
			 t2.setBounds(380,300,250,30);
			 p1.add(t2);
			 l4.setText("Enter Your Roll No");
			 l4.setBounds(150,380,200,50);
			 p1.add(l4);
			 t3.setText(" ");
			 t3.setBounds(380,390,250,30);
			 p1.add(t3);
			 l5.setText("Enter Your Enroll No");
			 l5.setBounds(150,470,200,50);
			 p1.add(l5);
			 t4.setText(" ");
			 t4.setBounds(380,480,250,30);
			 p1.add(t4);
			 b2.setLabel("SUBMIT");
			 b2.setBounds(200,600,150,40);
			 p1.add(b2);
			 b3.setLabel("CLEAR");
			 b3.setBounds(400,600,150,40);
			 p1.add(b3);
		}
		else if(ae.getSource()== b2)
		{
			l6.setText("Your Response Has Been Recorded !!!");
			l6.setBounds(240,670,350,50);
			p1.add(l6);
		}
		else if(ae.getSource()== b3)
		{
			t1.setText("   ");
			t2.setText("   ");
			t3.setText("   ");
			t4.setText("   ");	
			l6.setText("  ");
		}

	}

	public static void main(String args[])
	{
		new TryEventHandlingSwing ();
	}
}