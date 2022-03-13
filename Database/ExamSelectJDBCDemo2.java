//Final Exam Exercise ----program -4.2--->
//statement methode-- executeQuery();
//database connectivity code

import java.sql.*;

public class ExamSelectJDBCDemo2
{
	public static void main(String args[])
	{
		try
		{
			//register the driver class--->step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("");
			System.out.println("driver registered successfully.........");
			
			//establish the connection (create object of Connection interface)----->2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
			System.out.println("Connection established successfully");
			
			//Create Object of Statement Interface ----->step-3
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			String query="select*from bts";
			
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("");
			System.out.println("*****************************************");
			System.out.println("*****************BTS*********************");
			System.out.println("*****************************************");
			System.out.println("");
			System.out.println("ID\tName\t\tMarks");
			rs.absolute(3);

			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}