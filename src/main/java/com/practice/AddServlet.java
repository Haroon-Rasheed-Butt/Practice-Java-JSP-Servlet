package com.practice;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		double a = Double.parseDouble(req.getParameter("num1"));
//		double b = Double.parseDouble(req.getParameter("num2"));
//		
//		double add  = a+b;
//		res.getWriter().println(add);
//	}
	
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		double a = Double.parseDouble(req.getParameter("num1"));
//		double b = Double.parseDouble(req.getParameter("num2"));
//		
//		double add  = a+b;
////		res.getWriter().println(add);
//		req.setAttribute("square", add);
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
//	}
		
//	// url rewriting param sendRedirect
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		double a = Double.parseDouble(req.getParameter("num1"));
//		double b = Double.parseDouble(req.getParameter("num2"));
//		
//		double add  = a+b;
//		res.sendRedirect("square?number="+add);	
//	}
	
	
//	// httpSession management when using sendRedirect
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		double a = Double.parseDouble(req.getParameter("num1"));
//		double b = Double.parseDouble(req.getParameter("num2"));
//		double add  = a+b;
//		HttpSession session = req.getSession();
//		session.setAttribute("number", add);
//		res.sendRedirect("square");	
//	}
	
	// cookies when using sendRedirect
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		double a = Double.parseDouble(req.getParameter("num1"));
		double b = Double.parseDouble(req.getParameter("num2"));
		double add  = a+b;
		Cookie cookie = new Cookie("numberToSquare", String.valueOf(add));
		res.addCookie(cookie);
		res.sendRedirect("square");	
	}
	

}
