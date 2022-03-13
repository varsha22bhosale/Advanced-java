import java.awt.*;
class MenuBarMenuMenuItem extends Frame
{
	MenuBarMenuMenuItem()
	{
		setLayout(null);
		
		setBackground(Color.yellow);
		setFont(new Font("Times New Romans",Font.BOLD,17));
		MenuBar mbr = new MenuBar();
		
		Menu file   = new Menu ("File",true);
		MenuItem f1 = new MenuItem ("New");
		MenuItem f2 = new MenuItem ("Save");
		MenuItem f3 = new MenuItem ("Open");
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
		
		setMenuBar(mbr);
		
		
		
	}
	
	public static void main(String args[])
	{
		MenuBarMenuMenuItem obj = new MenuBarMenuMenuItem();
		obj.setSize(700,600);
		obj.setVisible(true);
		obj.setTitle("Notepad");
		
	}
}