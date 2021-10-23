import java.awt.*;
import java.awt.event.*;
class ActionLoginForm extends Frame implements ActionListener
{
	Button btn;
	TextField t1,t2;
	Label l3;
	ActionLoginForm()
	{
		/*FlowLayout f = new FlowLayout ();
		setLayout(f);*/
		setLayout(null);
		setBackground(Color.pink);
		Font f = new Font("Calibri",Font.BOLD,25);
		Label lb  = new Label (" GRWPT STUDENT LOGIN FORM ");
		Label l1  = new Label("Enter User Id");
		Label l2  = new Label("Enter Password");
		l3=new Label("                       ");
		 t1 = new TextField(30);
		 t2 = new TextField(30);
		btn= new Button("Sign In");
		
		lb.setFont(f);
		l3.setFont(f);
		lb.setBounds(280,100,500,40);
		l1.setBounds(280,240,100,30);
		t1.setBounds(430,240,220,30);
		l2.setBounds(280,320,100,30);
		t2.setBounds(430,320,220,30);
		btn.setBounds(390,430,100,40);
		l3.setBounds(540,430,280,50);
		t2.setEchoChar('*');
		add(lb);
		add(l1);		
		add(t1);		
		add(l2);		
		add(t2);		
		add(btn);
		add(l3);
		
				
		btn.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String ui=t1.getText();
		String pd=t2.getText();
		if(ui.equals("varsha bhosale")&&pd.equals("grwpt2021"))
		{
			l3.setText("LOGIN SUCCESSFUL :)");
		}
		else
		{
			l3.setText("LOGIN FAILED !! :(");
		}
		
	}
	public static void main (String args[])
	{
		ActionLoginForm obj = new ActionLoginForm();
		obj.setSize(900,700);
		obj.setVisible(true);
		obj.setTitle(" STUDENT LOGIN FORM ");
		
	}
}