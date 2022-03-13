//Final Exam Exercise ----program -10.1>---( select* from the table)>
//PreparedStatement methode-- executeQuery();----->ResultSet interface
//student table
//database connectivity code(11)

import java.sql.*;
import java.util.*;
class ExamPreparedSelectJDBCDemo1
{
	public static void main(String args[])
	{
		try
		{
			//register the driver------->step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver registerd successfully");
			
			//establish the connection----->step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");//here 'exam' is the database name , root is the username fron student table.
			System.out.println("Connection established successfully");
			
			//create an object of PrepaerdStatement interface-------->step3
			PreparedStatement pstmt = con.prepareStatement();
			String query = "select*from student";
			System.out.println("object of prepareStatement created successfully");
			System.out.println("************************************************");
			System.out.println("************************************************");
			System.out.println("rollno\tname\t\t\tmarks");
			
			ResultSet rs = pstmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t\t"+rs.getInt(3));
			}
			System.out.println("************************************************");
			System.out.println("************************************************");
	
			
			
			//close the connection----->step5
			con.close();
			System.out.println("connection closed successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}