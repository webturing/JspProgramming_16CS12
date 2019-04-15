<%@page import="java.util.*,java.io.*" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style type="text/css">
		img{
			width: 50px;
			height: 40px;
		}
	</style>

</head>
<body>
<%!
Map<String,Double> fruits=new TreeMap<String,Double>();
Map<String,Integer> car=new TreeMap<String,Integer>();
%>
<%
fruits.put("Apple",2.5);
fruits.put("Orange",3.5);
fruits.put("Banana",4.5);
fruits.put("Kiwi",7.5);
fruits.put("Tomato",5.5);




%>
	<h1>淘宝生鲜超市</h1>
	<%
		String name=(String)session.getAttribute("username");
		if(name==null){
		out.println("您还没有登录，请<a href='login.jsp'>登录</a>");
			
		}else{
			car=(Map<String,Integer>)session.getAttribute("car");

		%>

	<p>欢迎 <%=name%>
	<table border="1">
		<tr>
			<td>图片</td>
			<td>商品名称</td>
			<td>单价</td>
			<td>购买</td>
		</tr>
		
		<tr>
			<%
			for(String f:fruits.keySet()){
				out.println(String.format("<tr><td><img src='%s'></td><td>%s</td><td>%.2f</td><td><a href='buy.jsp?name=%s'>BUY</a></td></tr>","apple.jpg",f,fruits.get(f),f));
			}
			%>

		</tr>


	</table>



	<%}%>

	<p>查看我的<a href="car.jsp">购物车</a></p>
</body>
</html>