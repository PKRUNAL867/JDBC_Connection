package database_example;
import java.sql.*;  
import javax.sql.*;

public class Connection1 {
	public static final String username="root";
				public static final String password="12345678";
				public static final String url="jdbc:mysql://localhost:3307/student";
				static Connection cn;
				public static Connection getConnection()
				{
					
					try {
				
						Class.forName("com.mysql.cj.jdbc.Driver");
			
						cn=DriverManager.getConnection(url,username,password);
						
						
					}
					catch(ClassNotFoundException e){
						e.printStackTrace();
					}
					catch(SQLException e){
						e.printStackTrace();
				
					}	
					return cn;
				}
				
		}

