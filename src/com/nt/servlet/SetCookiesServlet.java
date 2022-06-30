package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secsurl")
public class SetCookiesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		Cookie ck1=null,ck2=null,ck3=null,ck4=null;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		
// Creating 2-InMemory Cookies
		 ck1=new Cookie("AP","Amaravathi");
		 ck2=new Cookie("MP","Bhopal");
//Add to response object
		 res.addCookie(ck1);
		 res.addCookie(ck2);
		 
		 
		// Creating 2-Persistent Cookies
				 ck3=new Cookie("TS","Hyderabad");
				 ck4=new Cookie("MH","Mumbai");
				 ck3.setMaxAge(2*60);
				 ck4.setMaxAge(2*60);
		//Add to response object
				 res.addCookie(ck3);
				 res.addCookie(ck4);
				 
		pw.println("Sucessfully in Setting Cookies......");
		System.out.println("Sucessfully in Setting Cookies......");
				 
	
	}//doGet
}//class
