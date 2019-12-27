package Com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.util.URI;


public class sessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	//	String email= request.getParameter("email");
	//	String password= request.getParameter("password");
		
		//out.print(email + password);
   /*   String children= request.getParameter("children"); 
        String adults= request.getParameter("adults");
        String foreigners= request.getParameter("foreigners");
        String handy_cam= request.getParameter("handy-cam");
        String video_cam= request.getParameter("high-end-video-camera");
        String movie_camera= request.getParameter("movie-camera");
    */
      //  HttpSession session = request.getSession(); /* Creating a new session*/
       // session.setAttribute("uname", email);
       // session.setAttribute("uname1", password);
        
      
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
       	String email= request.getParameter("email");
		String password= request.getParameter("password");
		HttpSession session = request.getSession(); /* Creating a new session*/
        session.setAttribute("uname", email);
        session.setAttribute("uname1", password);
         out.println("<h3> Thanks for login</h3>");
        // request.getRequestDispatcher("payment1.jsp").include(request, response);
        System.out.println( new URI(request.getHeader("referer")).getPath());
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
     	         break;
     	    }
     
     	  }
       	 st.close(); 
         con.close();
       	 
        }
        
        else
        {
        	//out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limnote-sweetaleart2/6.11.4/sweetaleart2.all.js'></script>");

        	//out.println("<script src='https://ajax.googleleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
        	//out.println("<script src=alert/dist/sweetalert-dev.js></script> <link rel=stylesheet href=alert/dist/sweetalert.css>");
        	//out.println("<script>");
        	//out.println("$(document).ready(function(){");
        	//out.print("swal ("WELCOME","successfull!","success");");
        	//out.println("swal(Congrats!, , Your account is created!, 'success);");
        	//out.println("});");
        	//out.println("</script>");
        	out.println("invalid email address");
        }
    
        st.close(); 
        con.close(); 
        }
        catch (Exception e) { 
            e.printStackTrace(); 
        }
    
		
		}
	}   
        
	/*	HttpSession hs= request.getSession();
		if(hs==null)
		{
			out.println("<h2> no session  information is avilable</h2>");
		}
		else
		{
			Enumeration e= hs.getAttributeNames();
			out.println("<Table border=2><tr><th>Session AttributeNames</th><th>Session Attribute value</th></tr>");
			while(e.hasMoreElements())
			{
				String name=(String)e.nextElement();
				String value=(String)hs.getAttribute(name);
				out.println("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
			}
			out.println("</table>");
			long l1= hs.getCreationTime();
			long l2=hs.getLastAccessedTime();
			int l3= hs.getMaxInactiveInterval();
			out.println("<h3> The creation time is:"+new Date(l1)+"</h3>");
			out.println("<h3> The last access time is:"+new Date(l2)+"</h3>");
			out.println("<h3> The creation time is:"+l3+"</h3>");
	*/		
       // out.println("<h3> Thanks for login</h3>");
			//RequestDispatcher rd = request.getRequestDispatcher("payment1.jsp");
			//response.sendRedirect("payment1.jsp");
			//rd.include(request, response);
			//out.close();
	

	

