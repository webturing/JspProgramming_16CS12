<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>我的购物车</title>
</head>
<body>


	<p>欢迎 <%=session.getAttribute("username")%>
	
	<p>去<a href="mall.jsp">商城</a></p>

	<table border="1">
		<tr>
			<td>商品名称</td>
			<td>单价</td>
			<td>数量</td>
			<td>总价</td>
		</tr>
		
		<tr>
			<%
				Map<String,Double> fruits=new TreeMap<String,Double>();
				fruits.put("Apple",2.5);
				fruits.put("Orange",3.5);
				fruits.put("Banana",4.5);
				fruits.put("Kiwi",7.5);
				fruits.put("Tomato",5.5);
				Map<String,Integer> car=new TreeMap<String,Integer>();				
				if(session.getAttribute("car")!=null){
				car=(Map<String,Integer>)(session.getAttribute("car"));
				}


			double total=0;
			for(String f:car.keySet()){
					total+=fruits.get(f)*car.get(f);
				%>
				<tr>
					<td><%=f%></td>
					<td><%=fruits.get(f)%></td>
					<td><%=car.get(f)%></td>
					<td><%=fruits.get(f)*car.get(f)%></td>

				</tr>
				<%}%>

		</tr>


	</table>
	总价<%=total%>


</body>
</html>