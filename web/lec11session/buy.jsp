<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<%
	String name=request.getParameter("name");
	Map<String,Integer> car=new TreeMap<String,Integer>();			
	if(session.getAttribute("car")!=null){
		car=(Map<String,Integer>)(session.getAttribute("car"));

	}
	if(car.get(name)!=null){
		int old=car.get(name);
		car.put(name,old+1);
	}else{
	car.put(name,1);

	}
	response.sendRedirect("mall.jsp");
%>