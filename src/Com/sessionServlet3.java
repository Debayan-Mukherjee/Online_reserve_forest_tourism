package Com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class sessionServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        //request.getRequestDispatcher("log1.html").include(request, response);  
          
        HttpSession session=request.getSession(false); 
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");    
        if(session!=null){  

        String email=(String)session.getAttribute("uname"); 
        String password=(String)session.getAttribute("uname1"); 
        //response.sendRedirect("home.html");
        request.getRequestDispatcher("payment2.jsp").forward(request, response); 
       
        //response.sendRedirect("home.html");
       //request.getRequestDispatcher("home.html").include(request, response);
        }  
        else{  
            out.print("<h4>Please login first</h4>");  
            //request.getRequestDispatcher("log2.html").include(request, response); 
            
            request.getRequestDispatcher("login-modal.html").include(request, response); 
           // request.getRequestDispatcher("payment.html").include(request, response); 
        }  
        out.close();  
    }  
	

}
