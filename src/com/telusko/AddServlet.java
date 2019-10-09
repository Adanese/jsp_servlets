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
  public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
   {
	  
	int i = Integer.parseInt(req.getParameter("num1").trim());
	int j = Integer.parseInt(req.getParameter("num2").trim());
	
	int k = i+j;
	//System.out.print(k);
	//req.setAttribute("k", k);
	
	//RequestDispatcher rd = req.getRequestDispatcher("sq");
	//rd.forward(req, res);
	
	  
	  PrintWriter out = res.getWriter();
	  out.println("Hello to Sq"+k);	
   }
  
  
}

