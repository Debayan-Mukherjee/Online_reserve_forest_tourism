package Com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.debjdbc;

public class newBorn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try
		{
		Connection con = debjdbc.initialize(); 
		 Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM newBorn");
         PrintWriter out = response.getWriter();
	   
         request.getRequestDispatcher("jsp2.jsp").include(request, response);	
	    out.println("<html>");
	    out.println("<head><title>All Employees</title></head>");
	    out.println("<body>");
	    out.println("<center><h1>New Born</h1>");
	    
	   out.println( "<head>");
	   out.println( "<style>");
	   out.println("table {font-family: arial, sans-serif; border-collapse: collapse width: 100%; }");

	   out.println("td, th { border: 1px solid #dddddd; text-align: left;padding: 18px;}");

	   out.println( "tr:nth-child(even) { background-color: #dddddd;}");
	   out.println("r:nth-child(even) {background-color: #dddddd;}");
	   out.println("</style>");
	   out.println("</head>");
	   out.println("<body>");
	   
	  

	   out.println("<table>");
	   out.println("<tr><th>Date</th><th>Animal born</th><th>Number</th><th>Sex</th></tr>");
	   
	   
	   while(rs.next())
	   {
		 out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td> </tr>");
       }
	   
	   out.println("</table>");

	   out.println("</body>");
	   out.println(" </html>");
	   
		 } catch(Exception se) {
		        se.printStackTrace();
		        }
				
	}

	

}
