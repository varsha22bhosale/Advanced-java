import java.awt.*;
class GridLayoutDemo extends Frame
{
	GridLayoutDemo()
	{
		setFont(new Font("Curiuer",Font.BOLD,35));
		setBackground(Color.gray);
		//GridLayout g1 = new GridLayout();//first constructor
		//GridLayout g1 = new GridLayout(5,5);//second constructor--> numrows,numcol
		//GridLayout g1 = new GridLayout(5,5,10,10);//third Constructor--> numrows,numcol,Horz space,vert space
		//setLayout(g1);
		setLayout(new GridLayout(5,5,10,10));//short hand
		
		for(int i=1; i<=25; i++)
		{
			add(new Button(""+i));
		}
		
		
	setSize(800,800);
	setVisible(true);
	setTitle("GridLayout");
	}
	public static void main(String args[])
	{
		new GridLayoutDemo();
	}
	
}