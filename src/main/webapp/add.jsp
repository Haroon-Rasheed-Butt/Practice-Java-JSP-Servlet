<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add JSP</title>
</head>
	<body bgcolor="red">
			The Add JSP has rendered the following result from the servlet: 
			
			<%
				double a = Double.parseDouble(request.getParameter("num1"));
				double b = Double.parseDouble(request.getParameter("num2"));
				double add  = a+b;
				response.getWriter().println(add);
	
				/* Cookie cookie = new Cookie("numberToSquare", String.valueOf(add));
				response.addCookie(cookie); 
				response.sendRedirect("/add");*/	
			%>
	</body>
</html>