package Com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cancleservlet3
 */
public class cancleservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = debjdbc.initialize(); 
		try {  
      System.out.println("hii");
        PreparedStatement st = con.prepareStatement("delete from tourists where mailid=? ");
        String mail= request.getParameter("mailid"); 
        st.setString(9, mail);
        st.executeUpdate();
       
	}
		
		catch(Exception e)
		{
		}
		
		}

	
}
