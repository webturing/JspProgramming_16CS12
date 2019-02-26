<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaWeb系统开发</title>
</head>
<body style="text-align: center">
<h1 align="middle">JavaWeb系统开发</h1>
<h2>by ZHAO Jing</h2>
<table border="1" align="center">
    <tr>
        <td>周次
        </td>
         <td>资源</td>
        <td>备注</td>
    </tr>
    <%
        for (int i = 1; i <= 17; i++) {
    %>
    <tr>
        <td>第<%=i%>周
        </td>
        <td>
            <%=String.format("<a href=lec%02d>week%02d</a>", i, i)%>
                <%
                }

            %></a>
        </td>
    <td>

    </td>
    </tr>
</table>
</body>
</html>