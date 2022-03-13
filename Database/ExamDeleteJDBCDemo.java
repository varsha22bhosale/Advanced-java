//Final Exam Exercise ----program -3.2---(deleting records fron table)>
//statement methode-- executeUpdate();
//database connectivity code(6)

import java.sql.*;
class ExamDeleteJDBCDemo
{
	public static void main (String args[])
	{
		try
		{
			//register the driver----->step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registerd successfully");
			
			//esteblish the connection------>step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");//here 'exam' is the database name , root is the username.
			System.out.println("connection established successfully");
			
			//create object of statement interface----->step3
			Statement stmt  = con.createStatement();
			System.out.println("object of statement is created successgfully");
			
			// execute the query-------->step4
			int result = stmt.executeUpdate("delete from bts where id=7");
			System.out.println("deleted record = "+result);
			
			// close the connetion------->step5
			con.close();
			System.out.println("connection closed successfully");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}