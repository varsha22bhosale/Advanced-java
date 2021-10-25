import java.awt.*;
class Myframe2 extends Frame
{
      Myframe2(String str)
	  {
	     setVisible(true);
		 setSize(400,400);
		 setTitle(str);
	  }
	  public static void main(String args[])
	  {
	      Myframe2 f1=new Myframe2("VBTech");
	  }
}