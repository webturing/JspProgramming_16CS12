<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>

<div align="right">
<%if(session.getAttribute("username")==null){%>
	您还没有登录，请<a href="login.jsp">登录</a>
<%} else{%>
	欢迎<%=session.getAttribute("username")%>  <a href="logout.jsp">注销</a>
<%}%>
</div>