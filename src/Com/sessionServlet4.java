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


public class sessionServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         HttpSession session1 = request.getSession(false);
       
 if (session1!=null)
    { 
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-Z]+)+");
        Matcher m = p.matcher((String)session1.getAttribute("uname"));
        if(m.find() && m.group().equals((String)session1.getAttribute("uname")))  
        {
        out.print(new URI(request.getHeader("referer")).getPath());
        Pattern p1 = Pattern.compile("(\\w+)(\\.)(html)");
     	Pattern p4 = Pattern.compile("/");
     	String[] s = p4.split( new URI(request.getHeader("referer")).getPath());
     	   for(String s1 : s)
     	   {
     		
     	      Matcher m1=p1.matcher(s1);
     	      if(m1.find() && m1.group().equals(s1))
     	         {
     	            //request.getRequestDispatcher(s1).include(request, response);
     		          session1.invalidate(); 
     	              response.sendRedirect(s1);
     	            //HttpSession session=request.getSession();  
                    //session.invalidate();  
                      out.print("You are successfully logged out!");
     	              break;
     	         }
     
     	    }
     	  out.close(); 
         }
     	 else
     	   {
     		    out.print("you are already logged out");
     		    out.close(); 
     	   }
          
        out.close();  
   }

 
else
	try {
{
	
	Pattern p1 = Pattern.compile("(\\w+)(\\.)(html)");
 	Pattern p4 = Pattern.compile("/");
 	String[] s = p4.split( new URI(request.getHeader("referer")).getPath());
 	for(String s1 : s)
 	   {
 		
 	Matcher m1=p1.matcher(s1);
 	if(m1.find() && m1.group().equals(s1))
 	       {
 	       //request.getRequestDispatcher(s1).include(request, response);
 		     
 	         response.sendRedirect(s1);
 	         out.print("You are already logged out!");
 	         out.close(); 
            }
	    }

 }
	  }
 catch (Exception e) 
            {  e.printStackTrace(); 
               out.print("You are already logged out!");
               out.close();
            }
	}
}