<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">

	<title>简单考勤系统</title>

</head>
<body>
<%@include file="welcome.jsp"%>
	<div align="center">
	<h1 >简单考勤系统(application对象使用)</h1>
		<ol>
			<li><a href="showXML.jsp">读取WEB-INF目录下的web.xml文件</a></li>
			<li><a href="hall.jsp">显示在线用户</a></li>			
		</ol>
	</div>
	<%@include file="foot.jsp"%>	
</body>
</html>