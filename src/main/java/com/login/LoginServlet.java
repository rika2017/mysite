package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	   private String target = "/jsp/login/hello.jsp";

	   private static final long serialVersionUID = -3522462295690035558L;
	 
	       /* (non-Java-doc)
	        * @see javax.servlet.http.HttpServlet#HttpServlet()
	        */
	   public LoginServlet() {
		   super();
	   }          
	       
	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.getWriter().write("Hello, world!");
	       doPost(request,response);
	   }    
	       
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       String username = request.getParameter("username");
	       String password = request.getParameter("password");
	              
	       request.setAttribute("USER", username);
	       request.setAttribute("PASSWORD", password);
	              
	       ServletContext context = getServletContext();
	              
	       System.out.println("Redirecting to" + target);
	       RequestDispatcher dispatcher = context.getRequestDispatcher(target);
	       dispatcher.forward(request,response);
	    
	   }  
	   
	   public void mytest() {
		   int a;
		   if (1 ==1 )
			   a =1;
		   
	   }

}
