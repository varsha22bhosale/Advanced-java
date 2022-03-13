//Final Exam Exercise ----program -3---(inserting records in table)>
//statement methode-- executeUpdate();
//database connectivity code

import java.sql.*;

public class ExamInsertJDBCDemo 
{
	public static void main(String args[])
	{
		try
		{
			//register the driver class--->step-1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver registered successfully.........");
			
			//establish the connection (create object of Connection interface)----->2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
			System.out.println("Connection established successfully");
			
			//Create Object of Statement Interface ----->step-3
			Statement stmt = con.createStatement();
			
			//int result = stmt.executeUpdate("insert into bts (id,name,marks)values(1,'jungkook',100)");
			//int result1 = stmt.executeUpdate("insert into bts (id,name,marks)values(2,'Jin',98)");
			//int result2 = stmt.executeUpdate("insert into bts (id,name,marks)values(3,'Jimin',99)");
			int result3 = stmt.executeUpdate("insert into bts (id,name,marks)values(4,'jhope',90)");
			int result4 = stmt.executeUpdate("insert into bts (id,name,marks)values(5,'suga',92)");
			int result5 = stmt.executeUpdate("insert into bts (id,name,marks)values(6,'namjoon',90)");
			int result6 = stmt.executeUpdate("insert into bts (id,name,marks)values(7,'taehyung',91)");
			//System.out.println("number of rows insreted : "+result);	
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}