<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<h1>利用application读取网站配置文件</h1>
	<%
 		Properties props = new Properties();
        props.put("user", application.getInitParameter("user"));
        props.put("password", application.getInitParameter("pass"));
		props.put("characterEncoding", application.getInitParameter("characterEncoding"));
	%>

<%=props%>
</body>
</html>
