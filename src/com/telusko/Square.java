package com.telusko;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Square
{
	 public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	   {
		 int k = (int)req.getAttribute("k");
		 k = k*k;
		  
		 PrintWriter out = res.getWriter();
		 out.println("Result is = " +k);
		
	   }
	  
}
   