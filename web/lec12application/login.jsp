<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>欢迎登录</title>
</head>
<body>
	<%@ include file="welcome.jsp"%>
	<div align="middle">
		<h3>欢迎登录课程考勤系统，请输入自己学号，初始密码为123456</h3>
		<form action="login.jsp" method="post">
			<p>账号<input type="text" name="username"></p>
			<p>密码<input type="password" name="password"></p>
			<p><input type="submit" value="登录"> <input type="reset" value="清除"></p>
		</form>
	</div>

	<%
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if("123456".equals(password)){//password.equals("123456")
			session.setAttribute("username",username);
			List<String> users=new ArrayList<String>();
			if(application.getAttribute("users")!=null){
				users=(ArrayList<String>)application.getAttribute("users");
			}
			else {
				application.setAttribute("users",users);
			}
			users.add(username);
			session.setAttribute("username",username);
			response.sendRedirect("hall.jsp");
		}
	%>

</body>
</html>

