package Com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.util.URI;

/**
 * Servlet implementation class cancleservlet2
 */
public class cancleservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         HttpSession session1 = request.getSession(false);
       
     if (session1!=null)
       { 
	      response.sendRedirect("cancel.html");
       }
 else {
        
		Pattern p1 = Pattern.compile("(\\w+)(\\.)(html)");
     	Pattern p4 = Pattern.compile("/");
     	String[] s = p4.split( new URI(request.getHeader("referer")).getPath());
     	   for(String s1 : s)
     	   {
     		
     	      Matcher m1=p1.matcher(s1);
     	      if(m1.find() && m1.group().equals(s1))
     	         {
     	              response.sendRedirect(s1);
     	              break;
     	         }
     	   }
        }
 }  
          
	}

	

