# Java Web系统开发概述
by ZHAO Jing

## 课程目标：

### 掌握前端开发的基本技术和基本组件
- HTML/HTML5
- CSS/CSS3
- JavaScript/JQuery

### 掌握Java核心技术
- 异常和IO
- 字符串
- 集合框架
- 实用API


### 掌握面向对象的分析和设计技术
- 单例模式
- 观察者模式
-...

### 掌握Web数据库系统开发技术 JSP
- JSP
- JavaBean
- Servlet
- 数据库编程JDBC

### 掌握团队开发方法
- GIT

### 掌握服务器的配置
- Tomcat/JBoss/Weblogic
- Linux

## 课程考核：72学时
-  前端20%： 获得FCC证书可以直接拿到本部分的满分（2-3周，8-12学时）
-  Java核心编程30%：OJ选课刷题 （8-12学时)
-  JSP应用系统开发 50%： 可以部署在云上，代码托管在github上(36-48学时)

## 本讲内容:
### 开发环境搭建
- jdk
- intellij/eclipse
- mysql
- tomcat
- Chrome/Firefox
- git/github
### Web技术概述
- HTTP工作原理
- 静态网页
- 动态网页技术 
### 前端快速入门课程:
- FCC介绍
- 菜鸟网
- AOJ FCC2019春季培训班

##案例和源码
##百度模仿（纯前端 HTML+JS)
```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>百度一下,你就知道</title>
</head>
<body>
<script type="text/javascript">
    function run() {
        var kd = f01.keyword.value;
        alert(f01.keyword.value);
        window.open('https://www.baidu.com/s?wd=' + kd)
    }
</script>
<center>
    <div>
        <img src="https://www.baidu.com/img/bd_logo1.png"/>
    </div>
    <p>&nbsp
    <p>&nbsp

    <div>
        <form name="f01">
            <input type="text" name="keyword"/>
            <input type="submit" value='百度一下' onclick="run()"/>
        </form>
    </div>
    <p>&nbsp
    <p>&nbsp
    <p>&nbsp
    <p>&nbsp
    <p>&nbsp

    <div>
        Develop by zj@ahstu.edu.cn
    </div>
</center>
</body>

</html>
```

## 百度模仿2(JSP工作模式)
- 纯HTML表单 baidu.html
```HTML
<div>
	<form name="f01" action="baidu.jsp">
		<input type="text" name="keyword" />
		<input type="submit" value='百度一下' " />
	</form>
	</div>
```
- 后台处理JSP页 baidu.jsp
```HTML
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String keyword=request.getParameter("keyword");
response.sendRedirect("https://www.baidu.com/s?wd="+keyword);
%>

```