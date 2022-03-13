//Final Exam Exercise ----program -7>---( insert records into the table)>
//PreparedStatement methode-- executeUpdate();
//student table
//database connectivity code(7)

import java.sql.*;
import java.util.*;
class ExamPreparedInsertJDBCDemo 
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
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
			System.out.println("object of prepareStatement created successfully");
			System.out.println("************************************************");
			System.out.println("************************************************");
			
			for(int i=1; i<2;i++)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter roll no = ");
				int rn =sc.nextInt();
				
				System.out.println("Enter name = ");
				String nm = sc.next();
				
				System.out.println("Enter marks = ");
				int mk = sc.nextInt();
				
				pstmt.setInt(1,rn);
				pstmt.setString(2,nm);
				pstmt.setInt(3,mk);
				
				int count = pstmt.executeUpdate();
				System.out.println("number of rows inserted = "+count);
				
				}
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter roll no = ");
				int rn =sc.nextInt();
				
				System.out.println("Enter name = ");
				String nm = sc.next();
				
				System.out.println("Enter marks = ");
				int mk = sc.nextInt();
				
				pstmt.setInt(1,rn);
				pstmt.setString(2,nm);
				pstmt.setInt(3,mk);
				
				int count = pstmt.executeUpdate();
				System.out.println("number of rows inserted = "+count);
				
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
