package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shcsurl")
public class ShowCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		
	//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		
	pw.println("<h1 align='center'>Active Cookies</h1>");
    pw.println("<table border=1 align='center'>");		
    pw.println("<tr><td>Cookie Name</td>");	
    pw.println("<td>Cookie Value</td></tr>");	
	
    
   //Read Cookies Values
        Cookie[] cks=req.getCookies();
        if(cks!=null) {
        	for(Cookie ck:cks)
        		pw.println("<tr><td>"+ck.getName()+"</td>" + "<td>"+ck.getValue()+"</td></tr>");
        	    
        }else {
        	System.out.println("No Cookies Presents....");
        	pw.println("<br><b>No Cookies Presents....");
        }//else
		
		
	}//doGet
	
	
}//class
