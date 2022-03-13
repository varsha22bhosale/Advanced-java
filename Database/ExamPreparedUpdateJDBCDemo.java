//Final Exam Exercise ----program -7.1>---( update records from the table)>
//PreparedStatement methode-- executeUpdate();
//student table
//database connectivity code(8)

import java.sql.*;
import java.util.*;
class ExamPreparedUpdateJDBCDemo
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
			PreparedStatement pstmt = con.prepareStatement("update student set name=? where rollno=?");
			System.out.println("object of prepareStatement created successfully");
			System.out.println("************************************************");
			System.out.println("************************************************");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your roll no for updating your name  = ");
			int rn =sc.nextInt();
				
			System.out.println("Enter name for updation = ");
			String nm = sc.next();
				
			pstmt.setString(1,nm);
			pstmt.setInt(2,rn);
			
			int count = pstmt.executeUpdate();
			System.out.println("number of rows updated = "+count);
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