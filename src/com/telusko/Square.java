package com.telusko;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Square extends HttpServlet
{
	 public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	   {
		 int k = Integer.parseInt(req.getParameter("k"));
		 k = k*k;
		  
		 PrintWriter out = res.getWriter();
		 out.println("Result is = " +k);
		 
		 System.out.print("called");
		
	   }
	  
}
   