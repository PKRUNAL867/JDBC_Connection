package database_example;

import java.sql.*;
import javax.sql.*;

public class crud {
	static Statement st;
	Connection cn;
	public crud(){
		cn=Connection1.
				getConnection();
		try {
			st=cn.createStatement();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void insertData(){
		String iquesy = "insert into account values('a009','ganesh',45000)";
	try {
		int result=st.executeUpdate(iquesy);
		if(result>0)
		{
			System.out.println("record success");
		}
				
	}
	 catch (SQLIntegrityConstraintViolationException sq) {
	    	System.out.println("please enter unique number for accno");
	    }
	    catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
}
	public static void deletedata()
	{
		String squery="delete from account where accno='a001'";
		int r;
		try {
			r=st.executeUpdate(squery);
			if(r>0)
			{
				System.out.println("delete record successfully");
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
	}
	public static void updatedata()
	{
		String squery="update account set accno='a10' where accname='pinki'"; 
		int r;
		try {
			r=st.executeUpdate(squery);
			if(r>0)
			{
				System.out.println("data update succesfully");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	public static void getdata()
	{
		String squery="select *from account";
				try {
					ResultSet r=st.executeQuery(squery);
					System.out.println(" "+"no"+" "+"name"+" "+"balance");
					while(r.next())
					{
						System.out.println(" "+r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
					}
					
				}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
	}
}
