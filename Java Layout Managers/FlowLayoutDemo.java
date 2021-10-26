import java.awt.*;
class FlowLayoutDemo extends Frame
{
	FlowLayoutDemo()
	{
		//FlowLayout f1 = new FlowLayout();//first constructor
		//FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);//second constructor..value can be LEFT,RIGHT,OR CENTER..default is CENTER
		//FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT);
		//FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);//by defult its center
		//FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,30,30);// third constructor..horiz and vertical space added
		//setLayout(f1);
		setLayout(new FlowLayout(FlowLayout.CENTER,40,40));//short hand 
		
		Button b1 = new Button("FIRST");
		Button b2 = new Button("SECOND");
		Button b3 = new Button("THIRD");
		add(b1);
		add(b2);
		add(b3);
		
		
		
		setSize(900,900);
		setVisible(true);
		setTitle("FlowLayout Demo");
	}
	public static void main(String args[])
	{
		new FlowLayoutDemo();
		
	}
}