import java.awt.*;
import java.awt.event.*;
class FileDialogDemo extends Frame implements ActionListener
{
	Button b1 ;
	Button b2 ;
	
	FileDialogDemo()
	{
		setLayout(null);
		setFont(new Font("Courier",Font.BOLD,25));
		setBackground(Color.darkGray);
		b1 = new Button("Open FileDialog Box");
		b2 = new Button("Save FileDialog Box");
		b1.setBounds(600,100,300,80);
		add(b1);
		b2.setBounds(930,100,300,80);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(2000,1000);
		setVisible(true);
		setTitle("filedilog box");
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			FileDialog f1 = new FileDialog(this,"File Open Box",FileDialog.LOAD);
			f1.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			FileDialog f2 = new FileDialog(this,"File Save Box",FileDialog.SAVE);
			f2.setVisible(true);
		}
	}
	public static void main (String args[])
	{
		FileDialogDemo obj = new FileDialogDemo();
	}
}