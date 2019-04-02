<%@page import="jw.lec06.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		
		if(!password.equals(password2))
		{
			out.println("password not match!!");
		}else if(CheckUser.check(username))
		{
			out.println("username already existed!");
		}else
		{
			WriterUser.write(username,password);
			out.println("Register ok!");
		}
			
		
	%>
</body>
</html>