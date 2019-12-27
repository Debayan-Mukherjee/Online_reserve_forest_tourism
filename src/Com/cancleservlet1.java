
package Com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cancleservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
		Connection con = debjdbc.initialize(); 
try {
	Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT mailid,validation from tourists");
			
	 
	while(rs.next())
	{
			
		   String mail=rs.getString(1);
		   System.out.println(mail);
		   if(mail.equals(request.getParameter("mailid")))
		   {
		   PreparedStatement st = con.prepareStatement("delete from tourists  where mailid=?");
           System.out.println("hello");
           System.out.print(request.getParameter("mailid"));
           String s=request.getParameter("mailid");
           st.setString(1,s);
           System.out.println("hii2");
           int a= st.executeUpdate();
           System.out.println(a);
           out.print("<h1 style=color:red> Your Ticket cancelled , Your money will be refunded within 2 days</h1>");
           st.close();
           stmt.close();
		   
           con.close();
		   }
           else
           {
        	   System.out.println("hiii");
		   }
	}	
	
	out.print("<h1 style=color:red> No Ticket has been found in our system according to gien data</h1>");
	
    stmt.close();
    con.close();
}
	
		
	
	
	
		catch(Exception e)
		{
			
		}
		        
		       
		    }  
		

	}


