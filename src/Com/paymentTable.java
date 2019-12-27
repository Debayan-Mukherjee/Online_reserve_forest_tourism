package Com;

import java.io.IOException;
import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Import Database Connection Class file 
import Com.debjdbc;



public class paymentTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/* 
	   String[] g= new String[3];
	   DateFormat df = new SimpleDateFormat("dd/MM/yy");
	   Date dateobj = new Date();
	   //System.out.println(df.format(dateobj));
	   Pattern p = Pattern.compile("/");
	   String[] s= p.split(df.format(dateobj));
	   System.out.println(s[0]);
	   
	 */
	   //res.setContentType("text/html"); 
	   
	   
	   HttpSession session=request.getSession(false); 
	   //PrintWriter out = response.getWriter();
	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

       Date date = new Date();
       String todate = dateFormat.format(date);
       
       Calendar cal = Calendar.getInstance();
       cal.add(Calendar.DATE, +7);
       Date todate1 = cal.getTime();    
       String fromdate = dateFormat.format(todate1);
       System.out.println(fromdate);
       
       Calendar cal1 = Calendar.getInstance();
       cal1.add(Calendar.DATE, 0);
       Date todate2 = cal1.getTime();    
       String fromdate2 = dateFormat.format(todate2);
       System.out.println(fromdate2);
	  
       
		            Connection con = debjdbc.initialize(); 
		  
		            try {
		            PreparedStatement st = con 
		                    .prepareStatement("insert into tourists values(?,?,?,?,?,?,?,?,?,?)"); 
		            
		             String children= request.getParameter("children"); 
		             String adults= request.getParameter("adults");
		             String foreigners= request.getParameter("foreigners");
		             String handy_cam= request.getParameter("handy-cam");
		             String video_cam= request.getParameter("high-end-video-camera");
		             String movie_camera= request.getParameter("movie-camera");
		             String email=(String)session.getAttribute("uname");
		             System.out.print(email);
		            
		            
	        
		             st.setInt(1, Integer.valueOf(request.getParameter("children"))); 
		             st.setInt(2, Integer.valueOf(request.getParameter("adults")));
		             st.setInt(3, Integer.valueOf(request.getParameter("foreigners")));
		             st.setInt(4, Integer.valueOf(request.getParameter("handy-cam")));
		             st.setInt(5, Integer.valueOf(request.getParameter("high-end-video-cam")));
		             st.setInt(6, Integer.valueOf(request.getParameter("movie-camera")));
		             st.setString(7, fromdate2);
		             st.setString(8, fromdate); 
		             st.setString(9,email);
		             st.setString(10, "valid");
		             st.executeUpdate(); 
		          /*   int aNumber = 0; 
		             aNumber = (int)((Math.random() * 9000000)+1000000); 
		             System.out.print((aNumber+"E"));
		           */ 
		             //out.println("<html><h2>"+fromdate2+"</h2></html>"); 
		            // response.setContentType("login/html");
		             
		             //res.setContentType("text/html");  
		            // PrintWriter pw=res.getWriter();  
		              
		            // out.setAttribute(children, adults);,foreigners,handy-cam);
		             response.sendRedirect("ticket1.jsp");
		            // response.sendRedirect("home.jsp");
		             
		            // openInNewTab("home.html");
		            // window.open("");
		           
		             //st.executeUpdate(); 
		            	
		             
		           
		             st.close(); 
		             con.close(); 
		            
		            }
		            catch (Exception e) { 
		                e.printStackTrace(); 
		            }
		    }
		
	}


