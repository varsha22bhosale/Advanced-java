import java.awt.*;
class PMenu extends Frame
{
	PMenu()
	{
		setBackground(Color.pink);
	    setFont(new Font("Courier",Font.BOLD,35));
		MenuBar mb = new MenuBar();
		Menu m = new Menu ("Color");
		
		MenuItem mi1 = new MenuItem("Pink");
		MenuItem mi2 = new MenuItem("Green");
		MenuItem mi3 = new MenuItem("Red");
		MenuItem mi4 = new MenuItem("Yellow");
		MenuItem mi5 = new MenuItem("Black");
		
		mi3.setEnabled(false);
		
		
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);
		m.add(mi4);
		m.add(mi5);
		
		mb.add(m);
		
		setMenuBar(mb);
		
		setLayout(new FlowLayout());
		setSize(800,800);
		setVisible(true);
		setTitle("MENU");
		
	}
	public static void main(String args[])
	{
		new PMenu ();
	}

}