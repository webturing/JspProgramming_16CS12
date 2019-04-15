<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>欢迎登录</title>
</head>
<body>
	<form action="login.jsp" method="post">
		<p>用户名:<input type="text" name="username" placeholder="Enter you name"></p>
		<p>密码:<input type="password" name="password"></p>
		<p><input type="submit" value="登录"><p>


	</form>

<%
	if(request.getParameter("username")!=null){
	session.setAttribute("username",request.getParameter("username"));
	session.setAttribute("car",new TreeMap<String,Integer>());
	response.sendRedirect("index.jsp");

}
%>


</body>
</html>