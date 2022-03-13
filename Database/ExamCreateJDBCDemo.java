//Final Exam Exercise ----program -2--->
//statement methode-- execute();
//database connectivity code

import java.sql.*;

public class ExamCreateJDBCDemo 
{
	public static void main (String args[])
	{
		try
		{
			//register the driver class--->step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver registerd successfully");
			
			//establish the connection (create object of Connection interface)----->2
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
			System.out.println("Connection established successfully");
			
			//Create Object of Statement Interface ----->step-3
			Statement stmt = con.createStatement();
			
			//execute the query ----->step-4
			boolean flag = stmt.execute("create table bts(id int,name varchar(50),marks int)");
			
			//close the connection------->step-5
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}