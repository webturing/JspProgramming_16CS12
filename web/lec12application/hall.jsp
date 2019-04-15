<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>今天的考勤情况</title>
</head>
<body>
	
	<%@include file="welcome.jsp"%>
	<div align="center">
	<h1 >简单考勤系统(application对象使用)</h1>
	<%
		List<String> users=new ArrayList<String>();
		if(application.getAttribute("users")!=null)
			users=(ArrayList<String>)application.getAttribute("users");
	%>
	<h2>今天上课名单</h2>
	<table border=1 align="center">
		<tr>
			<td>姓名</td>
			<td>登录日期</td>
		</tr>
	<%for(String user:users){%>
		<tr>
			<td><%=user%></td>
		
			<td><%=new Date().toString()%></td>
		</tr>

	<%}%>
	</table>

	<h4>累计登录人数:<%=users.size()%></h4>
</div>
</body>
</html>