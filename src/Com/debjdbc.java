package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class debjdbc
{
protected static Connection initialize() 
  {
        Connection con=null;
		Statement st = null;
		
		
		try
		{
			//Class.forName("java.sql.Driver");
			//Class.forName("oracle.jdbc.driver.oracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "debayan");
			
		    //st=con.createStatement();
			//br=new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
		return con;
		
		

	}

}
