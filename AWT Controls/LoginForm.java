import java.awt.*;

class LoginForm extends Frame 
{
	
	LoginForm()
	{
		/*FlowLayout f = new FlowLayout ();
		setLayout(f);*/
		setLayout(null);
		setBackground(Color.pink);
		Font f    = new Font("Times New Roman",Font.BOLD,25);
		Label lb  = new Label (" GRWPT STUDENT LOGIN FORM ");
		Label l1  = new Label("Enter User Id");
		Label l2  = new Label("Enter Password");
		TextField t1 = new TextField(30);
		TextField t2 = new TextField(30);
		Button btn   = new Button("Sign In");
		
		lb.setFont(f);
		lb.setBounds(280,100,500,40);
		l1.setBounds(280,240,100,30);
		t1.setBounds(430,240,220,30);
		l2.setBounds(280,320,100,30);
		t2.setBounds(430,320,220,30);
		btn.setBounds(390,430,100,40);
		t2.setEchoChar('*');
		add(lb);
		add(l1);		
		add(t1);		
		add(l2);		
		add(t2);		
		add(btn);
	}
	
	public static void main (String args[])
	{
		LoginForm obj = new LoginForm();
		obj.setSize(900,700);
		obj.setVisible(true);
		obj.setTitle(" STUDENT LOGIN FORM ");
		
	}
}