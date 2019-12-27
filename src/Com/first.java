package Com;


import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
// Import Database Connection Class file 
import Com.debjdbc;
/**
 * Servlet implementation class first
 */

public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
      
  
            // Initialize the database 
            Connection con = debjdbc.initialize(); 
  
            try {
            PreparedStatement st = con 
                    .prepareStatement("insert into customers values(?, ?)"); 
   
            
             Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-Z]+)+");
             Matcher m = p.matcher( request.getParameter("email"));
             if(m.find() && m.group().equals(request.getParameter("email")))
              {
            	 st.setString(1, request.getParameter("email")); 
            	 st.setInt(2, Integer.valueOf(request.getParameter("password")));
            	  st.executeUpdate(); 
            	  st.close(); 
                  con.close();
               }
              
             else
             {
            	 System.out.println("invalid email address");
             }
         
            //t.executeUpdate(); 
   
             // Close all the connections 
             st.close(); 
             con.close(); 
            
            }
            catch (Exception e) { 
                e.printStackTrace(); 
            }
    }
}