import java.awt.*;
class TextAreadDemo extends Frame
{
	TextAreadDemo()
	{
		setBackground(Color.lightGray);
		Font f = new Font("Curiuer",Font.BOLD,20);
		setLayout(new FlowLayout());
		TextArea tf = new TextArea(25,60);//TextAction(int rows , int columns)
		tf.setText("enter your feedback");
		tf.setFont(f);
		tf.append("  hereeee");
		tf.insert(" valuable ",10);
		add(tf);
	}
	
	public static void main(String args[])
	{
		TextAreadDemo obj = new TextAreadDemo();
		obj.setSize(900,900);
		obj.setVisible(true);
		obj.setTitle("TextField");
	}
	
	
}