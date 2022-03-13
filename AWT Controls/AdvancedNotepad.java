import java.awt.*;
import java.awt.event.*;
class AdvancedNotepad extends Frame implements ActionListener
{
	MenuItem f2;
	MenuItem f3;
	AdvancedNotepad()
	{
		setLayout(new FlowLayout());
		
		//setBackground(Color.yellow);
		setFont(new Font("Times New Romans",Font.BOLD,17));
		MenuBar mbr = new MenuBar();
		
		Menu file   = new Menu ("File",true);
		MenuItem f1 = new MenuItem ("New");
		f2 = new MenuItem ("Save");
		f3 = new MenuItem ("Open");
		MenuItem f4 = new MenuItem ("Close");
		MenuItem f5 = new MenuItem ("Print");
		file.add(f1);
		file.add(f2);
		file.add(f3);
		file.add(f4);
		file.add(f5);
		
		Menu edit   = new Menu ("Edit",true);
		MenuItem e1 = new MenuItem ("Cut");
		MenuItem e2 = new MenuItem ("Copy");
		MenuItem e3 = new MenuItem ("paste");
		MenuItem e4 = new MenuItem ("Delete");
		MenuItem e5 = new MenuItem ("Undo");
		MenuItem e6 = new MenuItem ("Redo");
		edit.add(e1);
		edit.add(e2);
		edit.add(e3);
		edit.addSeparator();//separet the menuitems 
		edit.add(e4);
		edit.add(e5);
		edit.add(e6);
			
		Menu search = new Menu ("Search",true);
		MenuItem s1 = new MenuItem ("Find");
		MenuItem s2= new MenuItem ("Replace");
		MenuItem s3 = new MenuItem ("Next");
		MenuItem s4 = new MenuItem ("Bookmark");
		search.add(s1);
		search.add(s2);
		search.add(s3);
		search.add(s4);
		
		Menu view   = new Menu ("View",true);
		//CheckboxMenuItem it will creat selecteable menuitem
		CheckboxMenuItem v1 = new CheckboxMenuItem("Zoom");
		CheckboxMenuItem v2 = new CheckboxMenuItem("Word Wrap");
		CheckboxMenuItem v3 = new CheckboxMenuItem("Tab");
		CheckboxMenuItem v4 = new CheckboxMenuItem("Summary");
		view.add(v1);
		view.add(v2);
		view.add(v3);
		view.add(v4);
		
		mbr.add(file);
		mbr.add(edit);
		mbr.add(search);
		mbr.add(view);
		
		TextArea ta1 = new TextArea(44,207);
		add(ta1);
		
		setMenuBar(mbr);
		
		f2.addActionListener(this);
		f3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		/*here either we can get actionlistener by using 1]getSource method
		or we can use 2]getActionCommand method ...in getSource we have to 
		compare with actionlisteners's object ....and in getActionCommand
		we have to compare with label or texe....
		*/
		//if(ae.getSource()==f2)
		if(ae.getActionCommand()=="Open")
		{
			FileDialog fd1 = new FileDialog (this,"Varsha-open",FileDialog.LOAD);
			fd1.setVisible(true);
		}
		else
		{
			FileDialog fd2 = new FileDialog (this,"Varsha-save",FileDialog.SAVE);
			fd2.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		AdvancedNotepad obj = new AdvancedNotepad();
		obj.setSize(2000,1000);
		obj.setVisible(true);
		obj.setTitle("Notepad");
		
	}
}