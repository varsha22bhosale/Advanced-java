//Final Exam Exercise ----program -3.1---(updating records fron table)>
//statement methode-- executeUpdate();
//database connectivity code(5)

import java.sql.*;
class ExamUpdateJDBCDemo
{
	public static void main(String args[])
	{
		try
		{
			//register the driver------>step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver registerd successfully");
			
			//establish the connection----->step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");//here 'exam' is the database name , root is the username .
			
			//Create object of Statement interface----step3
			Statement stmt = con.createStatement();
			
			// execute the query ------>step4
			//int result = stmt.executeUpdate("update bts set name='tae' where id=7 ");
			int result = stmt.executeUpdate("update bts set name='JK' where id=1 ");
			System.out.println("Updated records = "+result);
			
			//close the connection------>step5
			con.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}