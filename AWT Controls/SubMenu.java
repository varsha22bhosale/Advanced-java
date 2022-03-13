import java.awt.*;
class SubMenu extends Frame
{
	SubMenu()
	{
		setFont(new Font("Times New Romans",Font.BOLD,16));
		MenuBar mbr = new MenuBar();
		
		Menu cl   = new Menu("class");
		MenuItem cl1 = new MenuItem ("FY");
		MenuItem cl2 = new MenuItem ("SY");
		MenuItem cl3 = new MenuItem ("TY");
		
		Menu lang = new Menu("Languages");
		MenuItem l1 = new MenuItem("Java");
		MenuItem l2 = new MenuItem("Python");
		MenuItem l3 = new MenuItem("JavaScript");
		
		Menu g = new Menu("GRWPT");
		MenuItem g1 = new MenuItem("Mess");
		MenuItem g2 = new MenuItem("Hostel");
		
		cl.add(cl1);
		cl.add(cl2);
		cl.add(cl3);

		lang.add(l1);
		lang.add(l2);
		lang.add(l3);
		
		g.add(lang);
		g.add(g1);
		g.add(g2);
		g.add(cl);
		
		mbr.add(g);
		
		setMenuBar(mbr);
			
		setSize(600,600);
		setVisible(true);
		setTitle("SUB MENU");
		
	}
	public static void main(String args[])
	{
		new SubMenu();
	}
}