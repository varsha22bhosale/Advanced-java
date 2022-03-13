//Final Exam Exercise ----program -1
//database connectivity code

import java.sql.*;

public class ExamJDBCDemo 
{
	public static void main (String args[])
	{
		try
		{
			//register the driver class--->step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver registerd successfully");
			
			//establish the connection----->2
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
			System.out.println("Connection established successfully");
			
			//
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}