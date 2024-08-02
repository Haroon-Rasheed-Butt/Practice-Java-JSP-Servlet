package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	// request dispatcher
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		double addedNumber = (double) req.getAttribute("square");
//		addedNumber = addedNumber * addedNumber;
//		
//		PrintWriter out = res.getWriter();
//		out.println(addedNumber);
//	}

//	// sendRedirect url parameter
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		double addedNumber = Double.parseDouble(req.getParameter("number"));
//		addedNumber = addedNumber * addedNumber;
//		
//		PrintWriter out = res.getWriter();
//		out.println(addedNumber);
//	}

//	// sendRedirect http session
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
//		double addedNumber = (double) session.getAttribute("number");
//		
//		double squareNumber = addedNumber * addedNumber;
//		
//		PrintWriter out = res.getWriter();
//		out.println(squareNumber);
//	}
	
	// sendRedirect cookies
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			Cookie[] cookies = req.getCookies();
			double addedNumber = 0;
			
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("numberToSquare")) {
					addedNumber = Double.parseDouble(cookie.getValue());
				}
			}
			
			
			double squareNumber = addedNumber * addedNumber;
			
			PrintWriter out = res.getWriter();
			out.println(squareNumber);
		}

}
