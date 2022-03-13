import java.awt.*;
class MenuNotePad extends Frame
{
	MenuNotePad()
	{
		setBackground(Color.pink);
		MenuBar mbr=new MenuBar();
		
		Menu m1=new Menu("file");
		MenuItem m11=new MenuItem("new");
		MenuItem m12=new MenuItem("open");
		MenuItem m13=new MenuItem("save");
		MenuItem m14=new MenuItem("save as");
		MenuItem m15=new MenuItem("close");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
	    m1.add(m15);
		
		Menu m2=new Menu("edit");
		MenuItem m21=new MenuItem ("undo");
		MenuItem m22=new MenuItem("cut");
		MenuItem m23=new MenuItem ("copy");
		MenuItem m24=new MenuItem("paste");
		MenuItem m25=new MenuItem("select");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		m2.add(m25);
		
		Menu m3=new Menu("view");
		MenuItem m31=new MenuItem("zoom");
		MenuItem m32=new MenuItem("word wrap");
		MenuItem m33=new MenuItem("tab");
		m3.add(m31);
		m3.add(m32);
		m3.add(m33);

        Menu m4=new Menu("settings");
		MenuItem m41=new MenuItem("import");
		MenuItem m42=new MenuItem("advanced settings");
		m4.add(m41);
		m4.add(m42);
		
		mbr.add(m1);
		mbr.add(m2);
		mbr.add(m3);
		mbr.add(m4);
		
		setMenuBar(mbr);
   }
		
	public static void main (String args[])
	{
		MenuNotePad o1=new MenuNotePad();
		o1.setVisible(true);
		o1.setSize(500,600);
		o1.setTitle("NotePad");
		
	}
}