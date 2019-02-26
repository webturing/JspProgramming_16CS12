<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>My Baidu</title>
</head>
<body>
<%
String keyword=request.getParameter("keyword");

response.sendRedirect("https://www.baidu.com/s?wd="+keyword);

%>
</body>
</html>