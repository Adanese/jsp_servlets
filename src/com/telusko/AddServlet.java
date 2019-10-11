package com.telusko;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
   {
	  
	int i = Integer.parseInt(req.getParameter("num1").trim());
	int j = Integer.parseInt(req.getParameter("num2").trim());
	
	int k = i+j;
	
	res.sendRedirect("sq?k="+k);
	
	//k = k*3;   
	//System.out.print(k);
	//sets the values of the req, so that it can be 
	//in other functions
	//req.setAttribute("k", k);
	
	//RequestDispatcher rd = req.getRequestDispatcher("sq");
	//rd.forward(req, res);
	
	  
	 // PrintWriter out = res.getWriter();
	  //out.println("Hello to Sq"+k);	
   }
  
  
}

